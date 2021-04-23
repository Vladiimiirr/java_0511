package task_4_2;
/*
   Создать класс Dog. У собаки должна быть кличка Строковое имя и возраст int age.
        Создайте геттеры и сеттеры для всех чисел класса Dog.
        Требования:
        • Программа не должна считывать данные с клавиатуры.
        • У класса Dog должна быть переменная имя с типом String.
        • У класса Собака должна быть переменная возраст с типом внутр.
        • У класса должен быть сеттер для переменных name.
        • У класса должен быть геттер для переменных name.
        • У класса должен быть сеттер для возраста.
        • У класса должен быть геттер для возраста.

*/

public class Dog {

  String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

