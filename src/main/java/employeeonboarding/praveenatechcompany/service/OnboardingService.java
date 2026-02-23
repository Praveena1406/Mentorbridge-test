package employeeonboarding.praveenatechcompany.service;

import com.swaggerexample.Swaggerex.model.EmployeeDto;
import employeeonboarding.praveenatechcompany.entity.OnboardingEntity;
import employeeonboarding.praveenatechcompany.mapper.OnboardingMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import employeeonboarding.praveenatechcompany.repository.OnboardingRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class OnboardingService {

    private final OnboardingRepository onboardingRepository;
    private final OnboardingMapper onboardingMapper;

    public ResponseEntity<String> addEmployee(EmployeeDto employeeDto) {
        OnboardingEntity onboardingEntity = OnboardingEntity.builder()
                .name(employeeDto.getName())
                .dept(employeeDto.getDept())
                .salary(employeeDto.getSalary())
                .build();
       onboardingRepository.save(onboardingEntity);
       return ResponseEntity.status(HttpStatus.CREATED).body("Employee created Successfully");
    }


    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<OnboardingEntity> onboardingEntityList = onboardingRepository.findAll();

        List<EmployeeDto> employeeDtoList = onboardingEntityList.stream()
                .map(onboardingMapper::entityToDto)
                .toList();
        return ResponseEntity.ok(employeeDtoList);
    }
}
