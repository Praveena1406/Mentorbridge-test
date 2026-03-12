package pagination.paginationtest.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pagination.paginationtest.dto.ProductDto;
import pagination.paginationtest.entity.ProductEntity;
import pagination.paginationtest.repository.ProductRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    ProductRepository productRepository;
    public void addProduct(ProductDto productDto) {
        ProductEntity productEntity = ProductEntity.builder()
                .productName(productDto.getProductName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .build();
        productRepository.save(productEntity);
    }

    public List<ProductEntity> getAllProducts(Pageable pageable) {
        List<ProductEntity> productList = productRepository.findAll(pageable).getContent();
        return productList;
    }
}
