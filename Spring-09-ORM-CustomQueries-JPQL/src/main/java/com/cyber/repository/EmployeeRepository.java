package com.cyber.repository;

import com.cyber.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e where e.email='amcnee1@google.es'")
    Employee getEMployeeDetail();

    @Query("select e.salary from Employee e where e.firstName='Aeriell'")
    Integer getEmployeeSalary();

    @Query("select e from Employee e where e.email=?1")
    Optional<Employee> getEmployeeByEmail(String email);


    //////// single named parameter

    @Query("select e from Employee  e where e.salary=:salary")
    Employee getEmployeeBySalary(@Param("salary") Integer salary);

    @Query("select e from Employee e where e.salary =:salary or e.firstName=:name")
    List<Employee> getEmployeeOrSalaryAndName(@Param("salary") int salary,
                                              @Param("name") String firstName);






}
