package com.makersharks.makersharks.service.serviceImpl;

import com.makersharks.makersharks.entity.Supplier;
import com.makersharks.makersharks.repository.SupplierRepository;
import com.makersharks.makersharks.service.SupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class SupplierServiceImpl implements SupplierService {

    private final Logger logger = LoggerFactory.getLogger(SupplierServiceImpl.class);

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Page<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, Pageable pageable) {
        logger.info("Attempting for Search Supplier");
        try{
            return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
                    location, natureOfBusiness, manufacturingProcesses, pageable);
        }catch(Exception e){
            logger.info("Failed for Search Supplier");
            throw e;
        }
    }
}
