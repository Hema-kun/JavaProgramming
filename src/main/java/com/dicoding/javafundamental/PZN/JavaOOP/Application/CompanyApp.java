package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.Company;

import java.sql.SQLOutput;

public class CompanyApp {

    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Programmer");

        Company.Employee employee = company.new Employee();
        employee.setName("Heru");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Budi");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
