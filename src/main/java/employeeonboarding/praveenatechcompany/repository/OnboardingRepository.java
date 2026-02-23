package employeeonboarding.praveenatechcompany.repository;

import employeeonboarding.praveenatechcompany.entity.OnboardingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OnboardingRepository extends MongoRepository<OnboardingEntity, String> {
}
