package demo.srmsystem.srm.service;

import demo.srmsystem.srm.model.Product;
import org.springframework.stereotype.Service;


public interface IProductService {
    public abstract Iterable<Product> getAllProducts();
    public abstract Product saveProduct(Product Product);
    public abstract Product getProductById(Long ProductId);
    public abstract void deleteProductById(Long ProductId);
}
