public class Main {
    public static void main(String[] args) {
        task1(0);
        task2(1, 2015);
        task3(2021);
        task4(95, 1);
        task5(1);
    }

    public static void task1 (int clientOS) {
        System.out.println("Задача 1");

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
            } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
            } else {
            System.out.println("К сожалению, не удается определить операционную систему!");
        }
    }

    public static void task2 (int clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");

        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке: ");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке: ");
            } else {
                System.out.println("К сожалению, не удается определить операционную систему!");
            }
        }
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке: ");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке: ");
            } else {
                System.out.println("К сожалению, не удается определить операционную систему!");
            }
        }
    }
    public static void task3 (int year) {
        System.out.println("Задача 3");

        if (year%400 == 0 && year%100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year%4 == 0 && year%100 != 0) {
            System.out.println(year + " год является високосным");
            } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task4 (int deliveryDistance, int deliveryTime) {
        System.out.println("Задача 4");

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            ++deliveryTime;
        } if (deliveryDistance < 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            ++deliveryTime;
        } if (deliveryDistance < 100 && deliveryDistance >= 60) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } if (deliveryDistance >= 100) {
            System.out.println("Доставки нет.");
        }
    }
    public static void task5 (int monthNumber) {
        System.out.println("Задача 5");

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 98:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ИСейчас осень");
                break;
            default:
                System.out.println("Неверный номер месяца. Попробуйте еще раз");
        }

    }
}