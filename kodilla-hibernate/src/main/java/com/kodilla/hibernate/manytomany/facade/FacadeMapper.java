package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FacadeMapper {
    public List<CompanyDto>  mapToCompanyDtoList(final List<Company> companies) {
        return companies.stream()
                .map(c -> new CompanyDto(c.getId(), c.getName()))
                .collect(Collectors.toList());
    }
    public List<EmployeeDto> mapToEmployeeDtoList(final List<Employee> employees) {
        return employees.stream()
                .map(e -> new EmployeeDto(e.getId(), e.getFirstname(), e.getLastname()))
                .collect(Collectors.toList());
    }
}
