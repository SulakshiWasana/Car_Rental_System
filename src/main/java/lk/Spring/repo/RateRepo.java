package lk.Spring.repo;

import lk.Spring.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepo extends JpaRepository <Rate, String> {
}
