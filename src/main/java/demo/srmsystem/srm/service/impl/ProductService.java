package demo.srmsystem.srm.service.impl;


import demo.srmsystem.srm.model.Product;
import demo.srmsystem.srm.repository.ProductRepository;
import demo.srmsystem.srm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
    @Autowired
    private ProductRepository repository;
    @Override
    public Iterable<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
         return  repository.save(product);
    }

    @Override
    public Product getProductById(Long productId) {
        return repository.findById(productId).orElse(null);
    }

    @Override
    public void deleteProductById(Long productId) {
         repository.deleteById(productId);
    }
}
