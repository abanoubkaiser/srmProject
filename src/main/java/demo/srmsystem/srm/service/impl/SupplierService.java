package demo.srmsystem.srm.service.impl;


import demo.srmsystem.srm.model.Supplier;
import demo.srmsystem.srm.repository.SupplierRepository;
import demo.srmsystem.srm.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService implements ISupplierService {
   @Autowired
     SupplierRepository repository;
    @Override
    public Iterable<Supplier> getAllSuppliers() {
        return repository.findAll();
    }

    @Override
    public Supplier saveSupplier(Supplier supplier) {
        return repository.save(supplier);
    }

    @Override
    public Supplier getSupplierById(Long supplierId) {
        return repository.findById(supplierId).orElse(null);
    }

    @Override
    public void deleteSupplierById(Long supplierId) {
        repository.deleteById(supplierId);
    }
}
