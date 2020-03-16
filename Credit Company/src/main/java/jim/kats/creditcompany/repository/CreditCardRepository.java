package jim.kats.creditcompany.repository;

import jim.kats.creditcompany.domain.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {

}
