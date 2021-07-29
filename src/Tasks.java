import java.util.Scanner;

public class Tasks {
    public void taskOne() {
        int number = 0;
        while (number <= 7) {
            System.out.println("Составить алгоритм: если введенное число больше 7,\n" +
                    " то вывести 'Привет'");
            System.out.println();
            System.out.println("Введите цифру больше 7: ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number > 7) {
                System.out.println("Привет");
                System.out.println();
                return;
            }
        }
    }

    public void taskTwo() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Составить алгоритм: если введенное имя совпадает с Вячеслав,\n" +
                "то вывести 'Привет, Вячеслав', если нет, то вывести 'Нет такого имени'");
        System.out.println();
        System.out.println("Пожалуйста, введите имя: ");
        name = sc.next();
        while (!name.equals("Вячеслав")) {
            System.out.println("Нет такого имени");
            System.out.println("Введите имя 'Вячеслав'");
            System.out.println();
            name = sc.next();
        }
        System.out.println("Привет, Вячеслав!");
        System.out.println();
    }


    public void taskThree() {
        System.out.println("Составить алгоритм: на входе есть числовой массив,\n" +
                "необходимо вывести элементы массива кратные 3");
        int[] ar = new int[15];
        System.out.println("Числа массива от 0 до 15 кратные 3: ");
        for (int a = 0; a <= 15; a++) {
            if (a % 3 == 0 & a > 0) {
                System.out.println(a);
            }
        }
    }

    int listOfTasks() {
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("***");
        System.out.println("Выберите задание :");
        System.out.println("Нажмите цифру 1 для выбора Задачи 1");
        System.out.println("Нажмите цифру 2 для выбора Задачи 2");
        System.out.println("Нажмите цифру 3 для выбора Задачи 3");
        System.out.println("Нажмите цифру 0 для выхода");
        System.out.println("***");
        selection = sc.nextInt();
        return selection;
    }
}

