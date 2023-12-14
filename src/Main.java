import java.time.LocalDate;

public class Main {
    public static int calculation(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        }
        else {
            System.out.println("Свыше 100 км доставки нет");
            return 0;
        }
    }
    public static void checkYear(int year) {
        if (year <= 1584) {
            System.out.println(year + " год не является високосным, так как високосные годы были введены после 1584 года.");
        }
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        }
        else System.out.println(year + " год не является високосным.");
    }

    public static void checkYearAndOs (int clientOS1, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < currentYear) {
            if (clientOS1 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS1 == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS1 == 0) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (clientOS1 == 1) {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 1584;
        checkYear(year);


        System.out.println("Задание 2");
        int clientOS1 = 0;
        int currentYear = LocalDate.now().getYear();
        //int f = LocalDate.now().getYear();
        checkYearAndOs(clientOS1, currentYear);


        System.out.println("Задание 3");
        System.out.println("Потребуется дней" + calculation(101));
    }
}