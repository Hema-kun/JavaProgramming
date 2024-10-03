package com.dicoding.javafundamental.PZN.JavaOOP.Inheritance;

public class PolymorphismApp {

    public static void main(String[] args) {

        Employee employee = new VicePresident("Heru");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new VicePresident("Joko");
        employee.sayHello("Budi");

        sayHello(new Employee("Heru"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP"+ vicePresident.name);

        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello manager " +manager.name);
        }else{
            System.out.println("Hello "+ employee.name);
        }

    }
}
