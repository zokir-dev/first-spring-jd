package com.cyber.repository;

import com.cyber.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {


    //Named query
    List<Department> retrieveDepartmentByDivision(String division);

}
