package com.example.mobile.service;

import com.example.mobile.entity.Address;
import com.example.mobile.entity.Brands;
import com.example.mobile.repository.BrandsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandsService implements IBrandsService{
    private final BrandsRepository brandsRepository;

    public BrandsService(BrandsRepository brandsRepository) {
        this.brandsRepository = brandsRepository;
    }

    @Override
    public List<Brands> findAll() {
        return brandsRepository.findAll();
    }

    @Override
    public Brands addBrand(Brands brands) {
        return brandsRepository.save(brands);
    }

    @Override
    public Brands updateBrand(Brands brands) {
        return brandsRepository.save(brands);
    }

    @Override
    public void deleteBrandsById(Integer id) {
        brandsRepository.deleteById(id);
    }
}
