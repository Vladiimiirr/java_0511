package task_5_1;
/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String str;
        String str1;
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        names.add("Алена");
        names.add("Алексей");
        names.add("Андрей");
        names.add("Ольга");

        str=names.get(0);
        for (int j=1;j<names.size();j++) {
            for (int i = j; i < names.size(); i++) {
                str1 = names.get(i);
                if (str.equals(str1))
                    names.remove(i);
            }
            if(j<names.size())str=names.get(j);
        }
        System.out.println(names);
    }
}