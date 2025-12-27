//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else  {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задание 2");
        int clientDeviceYear = 2012;
        if (clientOs == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        } else if (clientOs != 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите лбычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задание 3");
        int year = 2020;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " " + "Год является високосным");
            } else {
                System.out.println(year + " " + "Год не является високосным");
            }
        }

        System.out.println();
        System.out.println("Задание 4");
        int deliveryDistance = 112;
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Доставка на расстояние более 100 км не осуществляется.");
        }
        System.out.println("Потребутся дней:" + deliveryDays + " " + "срок доставки.");

        System.out.println();
        System.out.println("задание 5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон: Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон: Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон: Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон: Осень.");
                break;
        }
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12: Ошибка.");
        }

    }
}