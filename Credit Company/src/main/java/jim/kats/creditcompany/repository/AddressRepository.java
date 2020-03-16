package jim.kats.creditcompany.repository;

import jim.kats.creditcompany.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
