
package entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "addr")


class AddressEntity {
    @ID
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="addr_street",length=200,nullable=false)
    private String street;
    @Column(name="adr_district",length=200,nullable=false)
    private String district;



}
