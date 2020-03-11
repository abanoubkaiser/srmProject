package demo.srmsystem.srm.controller;

import demo.srmsystem.srm.model.Supplier;
import demo.srmsystem.srm.service.ISupplierService;
import demo.srmsystem.srm.service.impl.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SupplierController {
   @Autowired
   ISupplierService supplierService;

    @GetMapping(value = {"/srm/supplier/list"})
    public ModelAndView listSuppliers() {
        ModelAndView mv=new ModelAndView();
        mv.addObject("suppliers",supplierService.getAllSuppliers());
        mv.setViewName("supplier/list");
        return mv;
    }
    @GetMapping("/srm/supplier/new")
    public String addNew(Model model)
    {
        model.addAttribute("supplier",new Supplier());
        return "/supplier/new";
    }
    @PostMapping("/srm/supplier/new")
    public  String addNew(@ModelAttribute("supplier") Supplier supplier)
    {
        supplierService.saveSupplier(supplier);
        return "redirect:/srm/supplier/list";
    }


}
