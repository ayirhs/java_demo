package dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class StudentResponseDTO {
    private int id;
    private String name;
    private String stuClass;
    private String fullAddress;

    public StudentResponseDTO(StudentEntity student) {
        this.id=student.getId();
        this.name=student.getName();
        this.stuClass=student.getStuClass();
        this.fullAddress=student.getAddress().getDistrict()+":"+student.getAddress().getStreet();


    }
}
