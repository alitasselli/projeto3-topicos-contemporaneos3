package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface BusinessRepository extends JpaRepository<Business, Long> {

}