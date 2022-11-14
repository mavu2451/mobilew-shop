package com.example.mobile.controller;

import com.example.mobile.entity.Address;
import com.example.mobile.repository.AddressRepository;
import com.example.mobile.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    @ResponseBody
    public List<Address> findAll(){
        return addressService.findAll();
    }

    @PostMapping("/add")
    public Address saveAddress(@RequestBody Address address){

        return addressService.addAddress(address);
    }

    @PutMapping("/update")
    public Address updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAddress(@PathVariable("id")Integer id){
        addressService.deleteAddressById(id);
    }
}
