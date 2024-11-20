public class Main {
    public static void main(String[] args) {

        System.out.println("task number 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            System.out.println("Установите приложение для Android по ссылке");
        }

        System.out.println();
        System.out.println("task number 2");
        int secondClientOS = 1;
        int yearPhone = 2016;
        if (secondClientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
            if (yearPhone <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (secondClientOS >= 0){
            System.out.println("Установите приложение для Android по ссылке");
            if (yearPhone <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println();
        System.out.println("task number 3");
        int year = 1593;
        if (((year % 4) == 0) && (year > 1584)) { // % == 0 - проверяем что год делится на 4 без остатка
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        System.out.println("task number 4");
        int deliveryDistance = 120;
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println();
        System.out.println("task number 5");
        int monthNumber = 2;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}
