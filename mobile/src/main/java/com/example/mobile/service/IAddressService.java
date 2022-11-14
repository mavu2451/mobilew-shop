package com.example.mobile.service;

import com.example.mobile.entity.Address;

import java.util.List;

public interface IAddressService {
    List<Address> findAll();
    Address addAddress(Address address);
    Address updateAddress(Address address);

    void deleteAddressById(Integer id);

}
