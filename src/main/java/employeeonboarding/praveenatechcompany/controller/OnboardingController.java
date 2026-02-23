package employeeonboarding.praveenatechcompany.controller;

import com.swaggerexample.Swaggerex.api.EmployeeApi;
import com.swaggerexample.Swaggerex.model.EmployeeDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import employeeonboarding.praveenatechcompany.service.OnboardingService;

import java.util.List;

@RestController
@RequestMapping("/onboard")
@AllArgsConstructor
public class OnboardingController implements EmployeeApi  {

    private final OnboardingService onboardingService;

    @Override
    public ResponseEntity<String> addEmployee(EmployeeDto employeeDto) {
        return onboardingService.addEmployee(employeeDto);
    }

    @Override
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        return onboardingService.getAllEmployees();
    }

}
