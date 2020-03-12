package demo.srmsystem.srm.service;

import demo.srmsystem.srm.model.Supplier;
import org.springframework.stereotype.Service;


public interface ISupplierService {

    Iterable<Supplier> getAllSuppliers();
    Supplier saveSupplier(Supplier Supplier);
    Supplier getSupplierById(Long SupplierId);
    void deleteSupplierById(Long SupplierId);

}
