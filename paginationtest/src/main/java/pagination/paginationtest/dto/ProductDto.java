package pagination.paginationtest.dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String productName;
    public String description;
    public double price;
}
