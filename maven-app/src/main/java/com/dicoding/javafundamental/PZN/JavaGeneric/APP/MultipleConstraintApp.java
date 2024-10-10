package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

public class MultipleConstraintApp {

    public static void main(String[] args) {

       //Error Data<Manager> managerData = new Data<Manager>(new Manager()); //Tidak implement sayChello
        Data<VicePresidennt> vicePresidenntData = new Data<>(new VicePresidennt());

    }

    public static interface CanSayHello{

        void sayHello(String name);
    }

    public static abstract class Employee{

    };

    public static class Manager extends Employee{

    }

    public static class VicePresidennt extends Employee implements CanSayHello{

        @Override
        public void sayHello(String name) {
            System.out.println("name " + name);
        }
    }

    public static class Data<T extends  Employee & CanSayHello>{

        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
