package peaksoft.controller;

import peaksoft.entities.Appointment;
import peaksoft.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {
    private final AppointmentService appointmentService;
    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }
    @GetMapping("/add")
    private String newAppointment(Model model) {
        model.addAttribute("newAppointment", new Appointment());
        return "appointment/addAppointment";
    }

    @PostMapping("/save")
    private String saveAppointment(@ModelAttribute("newAppointment") Appointment appointment) {
        appointmentService.save(appointment);
        return "redirect:/appointment/allAppointments";
    }

    @GetMapping("/allAppointments")
    private String getAllAppointments(Model model) {
        model.addAttribute("allAppointments", appointmentService.getAppointments());
        return "appointment/mainAppointment";
    }

    @GetMapping("/getAppointment/{id}")
    private String getAppointmentByID(@PathVariable("id") Long id, Model model) {
        model.addAttribute("appointment", appointmentService.show_appointment(id));
        return "appointment/mainAppointment";

    }

    @GetMapping("/update/{id}")
    private String updateAppointment(@PathVariable("id") Long id, Model model) {
        model.addAttribute("appointment", appointmentService.show_appointment(id));
        return "appointment/updateAppointment";
    }


    @PatchMapping("{id}/updateAppointment")
    private String saveUpdateAppointment(@PathVariable("id") Long id,
                                     @ModelAttribute("appointment") Appointment appointment) {
        appointmentService.update(id, appointment);
        return "redirect:/appointment/allAppointments";
    }


    @DeleteMapping("/delete/{id}")
    public String deleteAppointment(@PathVariable("id") Long id) {
        appointmentService.remove(id);
        return "redirect:/appointment/allAppointments";
    }
}
