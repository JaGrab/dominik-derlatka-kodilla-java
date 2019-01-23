package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final List<CompanyDto> companies = new ArrayList<>();

    public EmployeeDto(final int id, final String firstname, final String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public List<CompanyDto> getCompanies() {
        return companies;
    }
    public void addCompany(final CompanyDto company) {
        companies.add(company);
    }
}
