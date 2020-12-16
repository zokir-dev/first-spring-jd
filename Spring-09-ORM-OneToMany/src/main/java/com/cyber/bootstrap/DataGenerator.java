package com.cyber.bootstrap;

import com.cyber.entity.Department;
import com.cyber.entity.Employee;
import com.cyber.entity.Region;
import com.cyber.enums.Gender;
import com.cyber.repository.DepartmentRepositories;
import com.cyber.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;
   // DepartmentRepositories departmentRepositories;

    public DataGenerator(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
        //this.departmentRepositories = departmentRepositories;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        List<Region> regionList = new ArrayList<>();

        Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20), Gender.FEMALE,154864);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26), Gender.FEMALE,56752);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17), Gender.FEMALE,95313);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014,03,02), Gender.MALE,119764);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), Gender.MALE,55307);

        Department d1 = new Department("Sports","Outdoors");
        Department d2 = new Department("Tools","Hardware");
        Department d3 = new Department("Clothing","Home");
        Department d4 = new Department("Phones & Tablets","Electronics");
        Department d5 = new Department("Computers","Electronics");

        Region r1 = new Region("Southwest", "United States");
        Region r2 = new Region("NorthEast", "United States");
        Region r3 = new Region("NorthWest", "United States");
        Region r4 = new Region("Central", "Asia");
        Region r5 = new Region("Quebec", "Canada");

        e1.setDepartment(d1);
        e2.setDepartment(d1);
        e3.setDepartment(d1);
        e4.setDepartment(d4);
        e5.setDepartment(d5);

        e1.setRegion(r2);
        e2.setRegion(r3);
        e3.setRegion(r4);
        e4.setRegion(r1);
        e5.setRegion(r5);

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));
        regionList.addAll(Arrays.asList(r1,r2,r3,r4,r5));

        employeeRepository.saveAll(employeeList);
       //departmentRepositories.saveAll(departmentList);

        employeeRepository.deleteById(1);
    }
}
