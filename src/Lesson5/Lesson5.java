package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {

        Person pers = new Person();
        Person pers1 = new Person("Jon", "specialist", "Jon@email.com", "123654", 15200, 22);

//      Создать массив из 5 сотрудников

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Mahmudov Ismail", "Main Engineer", "marfino@mailbox.com", "892124562", 65000, 45);
        persArray[2] = new Person("Aleksandrov Andrey", "General designer", "Aleksandrov@mailbox.com", "8954615623", 100000, 26);
        persArray[3] = pers;
        persArray[4] = pers1;

//      С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (Person a : persArray) {if (a.age > 40) a.getInfo();}}
}
