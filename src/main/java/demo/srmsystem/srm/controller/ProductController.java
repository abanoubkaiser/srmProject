package demo.srmsystem.srm.controller;

import demo.srmsystem.srm.model.Product;
import demo.srmsystem.srm.model.Supplier;
import demo.srmsystem.srm.service.IProductService;
import demo.srmsystem.srm.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
   @Autowired
   IProductService productService;
@Autowired
ISupplierService supplierService;
    @GetMapping(value = {"/srm/product/list"})
    public ModelAndView listProducts() {
        ModelAndView mv=new ModelAndView();
        mv.addObject("products",productService.getAllProducts());
        mv.setViewName("product/list");
        return mv;
    }
    @GetMapping("/srm/product/new")
    public String addNew(Model model)
    {
        model.addAttribute("product",new Product());
        model.addAttribute("suppliers",supplierService.getAllSuppliers());

        return "/product/new";
    }
    @PostMapping("/srm/product/new")
    public  String addNew(@ModelAttribute("product") Product product)
    {
        productService.saveProduct(product);
        return "redirect:/srm/product/list";
    }

    

}
