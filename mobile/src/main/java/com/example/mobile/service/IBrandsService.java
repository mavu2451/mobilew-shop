package com.example.mobile.service;

import com.example.mobile.entity.Address;
import com.example.mobile.entity.Brands;

import java.util.List;

public interface IBrandsService {
    List<Brands> findAll();
    Brands addBrand(Brands brands);
    Brands updateBrand(Brands brands);

    void deleteBrandsById(Integer id);

}
