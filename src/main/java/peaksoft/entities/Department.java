package peaksoft.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "department")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="patient_gen",
            sequenceName = "patient_seq",
            allocationSize =1)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany
    @Column(nullable = false)
    private List<Doctor> doctors;
    @ManyToOne
    @Column(nullable = false)
    private Hospital hospital;

}
