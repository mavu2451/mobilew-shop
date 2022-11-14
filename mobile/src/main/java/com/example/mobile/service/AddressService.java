package com.example.mobile.service;

import com.example.mobile.entity.Address;
import com.example.mobile.repository.AddressRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class AddressService implements IAddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> findAll(){
        return addressRepository.findAll();
    }
    public Address addAddress(Address address){
        return addressRepository.save(address);
    }

    public Address updateAddress(Address address){
        return addressRepository.save(address);
    }

    public void deleteAddressById(@PathVariable("id") Integer id){
        addressRepository.deleteById(id);
    }

}
