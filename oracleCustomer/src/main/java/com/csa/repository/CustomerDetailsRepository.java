package com.csa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csa.entities.CustomerDetails;
@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer>{

}
