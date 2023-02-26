package peaksoft.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "appointment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="patient_gen",
            sequenceName = "patient_seq",
            allocationSize =1)
    private Long id;
    private LocalDate date;
    @ManyToOne
    @Column(nullable = false)
    private Patient patient;
    @ManyToOne
    @Column(nullable = false)
    private Doctor doctor;
    @ManyToOne
    @Column(nullable = false)
    private Department department;
}
