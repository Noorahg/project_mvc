package peaksoft.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "hospital")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="hospital_gen",
            sequenceName = "hospital_seq",
            allocationSize =1)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @OneToMany
    @Column(nullable = false)
    private List<Department> department;
    @OneToMany
    @Column(nullable = false)
    private List<Appointment> appointment;
    @OneToMany
    @Column(nullable = false)
    private List<Doctor> doctor;
    @OneToMany
    @Column(nullable = false)
    private List<Patient> patient;


}
