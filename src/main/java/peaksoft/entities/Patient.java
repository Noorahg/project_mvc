package peaksoft.entities;

import peaksoft.enums.Gender;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "patient")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="patient_gen",
            sequenceName = "patient_seq",
            allocationSize =1)
    private Long id;
    @Column(name="patient_name",nullable = false)
    private String firstName;
    @Column(nullable = false)
    private  String lastName;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private Gender gender;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @Column(nullable = false)
    private  Hospital hospital;
    @OneToMany
    @Column(nullable = false)
    private List<Appointment> appointment;
}
