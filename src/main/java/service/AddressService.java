package service;


import dto.response.AddressResponseDTO;
import entity.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    public AddressResponseDTO save(AddressResponseDTO request){
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setDistrict(request.getDistrict());
        addressEntity.setStreet(request.getstreet());

        AddressEntity savedAddress=addressRepo.saveAndFlush(adressEntity);
        return new AddressResponseDTO(savedAddress);
    }
    public List<AddressResponseDTO> findAllAddress(){
        List<AddressResponseDTO> allRecords=addressRepo.findAll();
        allRecords.forEach(item->(
                AddressResponseDTO addressresponseDTO=new AddressResponseDTO(item);
                addressResponseDTOS.add(addressResponseDTO);
    )};
        return addressResponseDTOS;




}