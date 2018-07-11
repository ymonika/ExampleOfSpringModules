package com.repository;

import com.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

    Employee findById(Long id);

    @Transactional
    void deleteById(Long id);
}
