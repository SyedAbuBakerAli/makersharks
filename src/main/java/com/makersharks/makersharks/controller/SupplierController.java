package com.makersharks.makersharks.controller;

import com.makersharks.makersharks.entity.Supplier;
import com.makersharks.makersharks.service.SupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private static final Logger logger = LoggerFactory.getLogger(SupplierController.class);


    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public Page<Supplier> querySuppliers(
            @RequestParam @NotBlank String location,
            @RequestParam @NotBlank @Pattern(regexp = "small_scale|medium_scale|large_scale") String natureOfBusiness,
            @RequestParam @NotBlank @Pattern(regexp = "moulding|3d_printing|casting|coating") String manufacturingProcesses,
            Pageable pageable) {
        logger.info("Controller: Attempting for Search Supplier");
        try{
            return supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcesses, pageable);
        }catch (Exception e){
            logger.info("Controller: Failed for Search Supplier");
            throw e;
        }
    }
}
