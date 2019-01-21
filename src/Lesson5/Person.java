package Lesson5;

public class Person {
    //ФИО, должность, email, телефон, зарплата, возраст;
    private String name;
    private String position;
    private String email;
    private String telephone;
    public int salary;
    public int age;

    //Конструктор класса должен заполнять эти поля при создании объекта;

    public Person() {
        this.name = "Josh Smith";
        this.position = "Art Director";
        this.email = "Josh@email.com";
        this.telephone = "+ 7 (499) 123 4567";
        this.salary = 10000;
        this.age = 42;
    }

    public Person(String name, String position, String email, String telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void getInfo(){
        System.out.println();
        System.out.println("Информация о сотруднике: " + this.name);
        System.out.println("Должность: " + this.position);
        System.out.println("E-mail: " + this.email);
        System.out.println("Телефонный номер: " + this.telephone);
        System.out.println("Заработная плата: " + this.salary);
        System.out.println("Возраст: " + this.age);
        System.out.println();

    }
}


