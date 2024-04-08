package oop;

/**
 * Создайте класс Person, который будет представлять человека. У этого класса должны быть поля: name (имя), age (возраст), gender (пол).
 * Добавьте конструктор в класс Person, который принимает параметры name, age и gender, и инициализирует соответствующие поля.
 * Создайте метод getInfo(), который будет возвращать строку с информацией о человеке (например, "Имя: [name], Возраст: [age], Пол: [gender]").
 * Создайте несколько объектов класса Person и выведите информацию о них, используя метод getInfo().
 */

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[8]; //создание масива Person

        // добавление людей и рабочих в массив
        people[0] = new Employee("Ivan", 25, "men", 15000);
        people[1] = new Person("Liza", 22, "women");
        people[2] = new Employee("Vova", 35, "men", 5000);
        people[3] = new Employee("Katya", 28, "women", 22000);
        people[4] = new Person("Dima", 56, "men");


        for (Person person : people) {
            System.out.println(person.getInfo());
        }

    }



}

/**
 * создать Person2 с обертками, внутри main создать новых персон2 с обертками и передать внутри конструктор значения
 * примитивных типов  и значения оберток
 * найти то значение которое позволит получить ошибку компилятора когда нелья привести типы
 *
 */