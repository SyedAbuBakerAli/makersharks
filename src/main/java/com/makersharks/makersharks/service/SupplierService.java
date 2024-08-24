package com.makersharks.makersharks.service;

import com.makersharks.makersharks.entity.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SupplierService {

    Page<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, Pageable pageable);
}
