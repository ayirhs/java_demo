package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepo extends JpaRepository<AddressEntity.Integer>
{
    List<AddressEntity> findbyDistrict(String district);

    @Query{
        nativeQuery =true,
        value="select * from addr where addr_district= ?1"
    }
    List<AddressEntity>getByDis(String dist);
}
