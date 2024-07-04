package com.shriya.demo.controller;


import dto.request.AddressCreationDTO;
import dto.response.AddressResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.AddressService;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/addr")
@RequiredArgsConstructor

public class AddressController {
    private final AddressService addressService;
    private final ServerProperties serverProperties;

    @PostMapping("/save")
    public ResponseEntity<AddressResponseDTO> save(@RequestBody AddressCreationDTO request) {
        return ResponseEntity.ok(addressService.save(request));
    }
    @GetMapping("/fetch")
    public ResponseEntity<List<AddressResponseDTO>> fetch() {
        return ResponseEntity.ok(addressService.findAllAddress());

    }
    @GetMapping("/get")
    public ResponseEntity<AddressResponseDTO> getAddress(@RequestParam("id") int id) {
        return ResponseEntity.ok(addressService.findAddressById(id));

    }
    @GetMapping("/update")
    public ResponseEntity<AddressResponseDTO> update(@RequestParam Integer id,
                                                     @RequestBody AddressCreationDTO
                                                             request) {
        return ResponseEntity.ok(addressService.updateAddres(id,request));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam("id") Integer id) {
        return ResponseEntity.ok(addressService.deleteAddressById(id));
    }



}
