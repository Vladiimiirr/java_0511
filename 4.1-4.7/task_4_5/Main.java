package task_4_5;

/*
        Создать абстрактный класс Animal с характеристиками животного.
        Создать класс Лошадь который наследуется от Animal, в классе Лошадь реализовать метод public void run () {System.out.println ("Игого, я поскакал (а)"); }
        Создать класс Пегас, который наследуется от Лошади, в классе Пегас реализовать метод public void fly () {System.out.println ("Игого, я полетел (а)"); }
        Создать объект лошади и вызвать метод run ();
        Создать объект пегаса и вызвать метод fly ();
        */

public  class  Main {
    public  static  void  main ( String [] args ) {
    Horse horse = new Horse();
    horse.run();

    Pegasus pegasus =new Pegasus();
    pegasus.fly();
    }
}

abstract class Animal{
    public String eat;
    public String name;
    public int age;
    public String color;
}

class Horse extends Animal{

    public void run () {System.out.println ("Игого, я поскакал (а)"); }
}

class Pegasus extends Horse{
    public void fly () {System.out.println ("Игого, я полетел (а)"); }
}