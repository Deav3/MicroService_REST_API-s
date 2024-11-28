package com.ihub.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ihub.www.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>
{

}
