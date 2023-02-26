package peaksoft.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="doctor_gen",
            sequenceName = "doctor_seq",
            allocationSize =1)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String positions;
    @Column(unique = true,nullable = false)
    private String email;
    @OneToMany
    @Column(nullable = false)
    private List<Department> department;
    @OneToMany
    @Column(nullable = false)
    private List<Appointment> appointment;

}
