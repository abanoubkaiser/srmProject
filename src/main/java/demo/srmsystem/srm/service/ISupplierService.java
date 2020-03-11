package demo.srmsystem.srm.service;

import demo.srmsystem.srm.model.Supplier;
import org.springframework.stereotype.Service;


public interface ISupplierService {

    public abstract Iterable<Supplier> getAllSuppliers();
    public abstract Supplier saveSupplier(Supplier Supplier);
    public abstract Supplier getSupplierById(Long SupplierId);
    public abstract void deleteSupplierById(Long SupplierId);

}
