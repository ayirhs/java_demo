package com.example.demo.controller;

import com.example.demo.dto.request.AddressCreationDTO;
import com.example.demo.dto.response.AddressResponseDTO;
import com.example.demo.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ozads
 * @version v1.0
 * @project cab demo
 * @since 2024-07-04
 **/
@RestController
@RequestMapping("/addr")
@RequiredArgsConstructor
@Tag(name="address",description ="address related APIs" )
public class AddressController {
    private final AddressService addressService;
    private final ServerProperties serverProperties;

    @PostMapping("/save")
    public ResponseEntity<AddressResponseDTO> save(@RequestBody
                                                       AddressCreationDTO request) {
        return ResponseEntity.ok(addressService.save(request));
    }
    @GetMapping("/fetch")
    public ResponseEntity<List<AddressResponseDTO>> fetch() {
        return ResponseEntity.ok(addressService.findAllAddress());
    }

    @GetMapping("/get")
    public ResponseEntity<AddressResponseDTO> getAddress(@RequestParam("id") Integer id) {
        return ResponseEntity.ok(addressService.findAddressById(id));
    }

    @PutMapping("/update")
    @Operation(
            summary="update address",
            description="this api assists in updating address",
            tags={"address","description"}

    )
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
