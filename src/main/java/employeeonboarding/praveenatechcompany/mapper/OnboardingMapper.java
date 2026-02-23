package employeeonboarding.praveenatechcompany.mapper;

import com.swaggerexample.Swaggerex.model.EmployeeDto;
import employeeonboarding.praveenatechcompany.entity.OnboardingEntity;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OnboardingMapper {
    private final ModelMapper modelMapper;

    public EmployeeDto entityToDto(OnboardingEntity onboardingEntity){
        return modelMapper.map(onboardingEntity,EmployeeDto.class);
    }
}
