package com.cydeo.bootstrap;

import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    public DataGenerator(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        Employee e1 = new Employee("Berie", "Manues", "bmanues@gmail.com", LocalDate.of(2016, 3, 11), 200000, Gender.Male);
        Employee e2 = new Employee("XMart", "Zeng", "Xzeng@gmail.com", LocalDate.of(2013, 5, 21), 210000, Gender.Female);
        Employee e3 = new Employee("Tartum", "Manues", "Tmanues@gmail.com", LocalDate.of(2011, 7, 1), 230000, Gender.Male);
        Employee e4 = new Employee("Klasium", "Bari", "Kbarie@gmail.com", LocalDate.of(2015, 12, 4), 250000, Gender.Female);
        Employee e5 = new Employee("Derium", "Wear", "dwear@gmail.com", LocalDate.of(2015, 05, 7), 240000, Gender.Female);

        Department d1 = new Department("Sports", "Outdoors");
        Department d2 = new Department("Tools", "Hardware");
        Department d3 = new Department("Clothing", "Home");
        Department d4 = new Department("Phones", "Electronics");
        Department d5 = new Department("Computer", "Electronics");

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        employeeRepository.saveAll(employeeList);
        departmentRepository.saveAll(departmentList);

    }



}
