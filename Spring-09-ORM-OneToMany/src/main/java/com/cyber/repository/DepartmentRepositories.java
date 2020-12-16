package com.cyber.repository;

import com.cyber.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositories extends JpaRepository<Department, Integer> {
}
