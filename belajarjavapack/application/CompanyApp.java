package belajarjavapack.application;

import belajarjavapack.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        // Cara mengakses inner class
        Company company = new Company();
        company.setName("INS KOFFIES");

        Company.Employee employee = company.new Employee();
        employee.setName("Iqbal");

        // Mengakses outer class
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        
        Company company2 = new Company();
        company2.setName("Belum Ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Steven");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }

}
