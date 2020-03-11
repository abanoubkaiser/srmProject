package demo.srmsystem.srm.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Supplier {

    @Id
    @GeneratedValue
    private Long  supplierId;
    private  Integer supplierNumber;
    private  String name;
    private  String contactPhoneNumber;
    @OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();
 public Supplier()
 {

 }
    public Supplier(Long supplierId, Integer supplierNumber, String name, String contactPhoneNumber) {
        this.supplierId = supplierId;
        this.supplierNumber = supplierNumber;
        this.name = name;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(Integer supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
