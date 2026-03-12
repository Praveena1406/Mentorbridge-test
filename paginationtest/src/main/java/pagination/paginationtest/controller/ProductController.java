package pagination.paginationtest.controller;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pagination.paginationtest.dto.ProductDto;
import pagination.paginationtest.entity.ProductEntity;
import pagination.paginationtest.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

     ProductService productService;

     @PostMapping("/addproduct")
     public String addProduct(@RequestBody ProductDto productDto){
         productService.addProduct(productDto);
         return "Product added Successfully";
     }

     @GetMapping("/getallproducts")
     public List<ProductEntity> getAllProducts(@RequestParam(required = false,defaultValue = "0") int pageNo,
                                               @RequestParam(required = false,defaultValue = "3") int pageSize){
         Pageable pageable = PageRequest.of(pageNo, pageSize);
         return productService.getAllProducts(pageable);
     }
}
