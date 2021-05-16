package task_4_3;

/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/
public class Main {
    public static void main(String[] args) {
        Cat Tom = new Cat();
        Tom.age=11;
        Tom.strength=13;
        Tom.weight =26;

        Cat Miki = new Cat();
        Miki.age=13;
        Miki.strength=14;
        Miki.weight =20;

        System.out.println(Tom.fight(Tom,Miki));
    }
}

class Cat {

    public int age;
    public int weight;
    public int strength;

    public boolean fight(Cat anotherCat) {return true;}

    public boolean fight(Cat anotherCat, Cat anotherCat_){
        boolean bool;
        int a=0, b=0;

        if(anotherCat.age<anotherCat_.age) a++; else b++;

        if(anotherCat.strength<anotherCat_.strength) a++; else b++;

        if(anotherCat.weight<anotherCat_.weight) a++; else b++;

        if (b<a) bool=true; else bool=false;

        return bool;
    }

}