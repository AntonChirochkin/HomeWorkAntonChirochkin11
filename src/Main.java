import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int year = 1985;
        checkIsPrintLeapYear(year);
    }

    static void checkIsPrintLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        checkAndroidIosYear(clientOS, clientDeviceYear);
    }

    static void checkAndroidIosYear(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Введены неверные параметры");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 65;
        checkDistance(deliveryDistance);

        System.out.println(checkDistance(deliveryDistance));
    }

    static String checkDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return "Для доставки потребуется: 1 день.";
        } else if (deliveryDistance > 20) {
            return "Для доставки потребуется: 2 дня.";
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            return "Для доставки потребуется: 3 дня.";
        } else {
            return "Достаки нет.";
        }
    }
}





