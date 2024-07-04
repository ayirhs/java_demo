package entity;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "stu")

public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="stu_name",length=200,nullable=false)
    private String name;
    @Column(name="stu_class",length=200,nullable=false)
    private String stuClass;
    @Mant


}
