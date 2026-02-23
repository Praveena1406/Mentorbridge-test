package employeeonboarding.praveenatechcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@Builder
public class OnboardingEntity {

    @Id
    private String id;
    private String name;
    private String dept;
    private int salary;
}
