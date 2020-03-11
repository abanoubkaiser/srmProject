package demo.srmsystem.srm.repository;


import demo.srmsystem.srm.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository <Supplier,Long> {
}
