package edu.miu.cs.cs544.customer.repository;

import edu.miu.cs.cs544.customer.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    Address getAddressById(Long addressId);

}
