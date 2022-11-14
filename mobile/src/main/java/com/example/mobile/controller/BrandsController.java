package com.example.mobile.controller;


import com.example.mobile.entity.Brands;
import com.example.mobile.service.BrandsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandsController {
    private final BrandsService brandsService;

    public BrandsController(BrandsService brandsService) {
        this.brandsService = brandsService;
    }

    @GetMapping
    @ResponseBody
    public List<Brands> findAll(){
        return brandsService.findAll();
    }

    @PostMapping("/add")
    public Brands addBrand(@RequestBody Brands brands){

        return brandsService.addBrand(brands);
    }

    @PutMapping("/update")
    public Brands updateBrand(@RequestBody Brands brands){
        return brandsService.updateBrand(brands);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBrand(@PathVariable("id")Integer id){
       brandsService.deleteBrandsById(id);
    }
}
