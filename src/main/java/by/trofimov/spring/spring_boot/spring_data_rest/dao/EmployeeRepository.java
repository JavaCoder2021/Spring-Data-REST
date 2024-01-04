package by.trofimov.spring.spring_boot.spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import by.trofimov.spring.spring_boot.spring_data_rest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
