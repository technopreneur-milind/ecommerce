package com.technopreneur.ecommerce.api;

import com.technopreneur.ecommerce.model.Package;
import com.technopreneur.ecommerce.model.Product;
import com.technopreneur.ecommerce.service.PackagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ecommerce/packages")
public class PackageController {

    @Autowired
    private PackagesService packagesService;

    @RequestMapping
    public List<Package> search()
    {
        return packagesService.search();
    }
    @RequestMapping("/{id}")
    public Package getPackage(@PathVariable String id)
    {
        return packagesService.getPackage(Integer.valueOf(id));
    }


}
