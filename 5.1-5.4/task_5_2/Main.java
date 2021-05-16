package task_5_2;

/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.util.HashMap;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap <String,String> map = new HashMap<>();
        while (true) {
            System.out.println("Введите город");
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            System.out.println("Введите фамилию");
            String family = scanner.nextLine();


            map.put(city,family);
        }

        System.out.println("Для пойска фамилии, введите город");
        String city_key = scanner.nextLine();
        System.out.println(map.get(city_key));
    }
}

/*
        Введите город
        Москва
        Введите фамилию
        Ивановы
        Введите город
        Киев
        Введите фамилию
        Петровы
        Введите город
        Лондон
        Введите фамилию
        Абрамовичи
        Введите город

        Для пойска фамилии, введите город
        Лондон
        Абрамовичи*/
