package lk.Spring.repo;

import lk.Spring.entity.Payment_Slip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Payment_SlipRepo extends JpaRepository <Payment_Slip, String> {
}
