package demo.srmsystem.srm.service;

import demo.srmsystem.srm.model.Product;
import org.springframework.stereotype.Service;


public interface IProductService {
      Iterable<Product> getAllProducts();
      Product saveProduct(Product Product);
      Product getProductById(Long ProductId);
      void deleteProductById(Long ProductId);
}
