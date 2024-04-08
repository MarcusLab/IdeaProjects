package oop;

/**
 * Реализация наследования и полиморфизма в программных проектах
 * Продолжение задания с Person:
 *
 *   1)Создайте класс Employee, который будет расширять класс Person. Добавьте дополнительное поле salary (зарплата) и
 *   конструктор для класса Employee, который будет вызывать конструктор суперкласса Person и инициализировать поле salary.
 *   2)Переопределите метод getInfo() в классе Employee, чтобы он возвращал информацию о работнике, включая его зарплату.
 *   3)Создайте несколько объектов класса Employee и выведите информацию о них, используя метод getInfo().
 *   4)Создайте массив объектов типа Person и добавьте в него как объекты класса Person, так и объекты класса Employee.
 *   Пройдитесь по массиву и вызовите метод getInfo() для каждого элемента.
 * (Обрати внимание на то, как динамическое связывание позволяет вызывать правильную версию метода getInfo() в зависимости от типа объекта)
 * 5) написать комментарии к каждой строчке кода
 * 6) обьяснить какие строки кода реализуют наследование в Java на примере Employe
 * 7) создать в классе Employee переменную age, геттер и сеттер для нее. Ответить на вопрос к какому полю age обращается
 * класс employee в своем методе getInfo и как можно обратиться к переменной age класса person из класса Employee и вывестии
 * ее из нового метода getPersonAge
 */

public class Employee extends Person {
    private int salary;
    private int age;

    // конструктор для класса Employee
    public Employee(String name, int age, String gender, int salary) {
        super(name, age, gender); //конструктор суперкласса Person
        this.salary = salary;
    }

public int getPersonAge(Person person){
        return person.getAge();
}

    @Override  // переопределение метода getInfo
    public String getInfo() {
        return super.getInfo() + ", зарплата: " + this.salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
