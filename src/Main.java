public class Main {
    public static void main(String[] args) {
        Task_1();
        // Задание 1
        //С помощью цикла for выведите в консоль все числа от 1 до 10.

        //Критерии оценки:
        // - Использован цикл for;
        // - Все значение от 1 до 10 выведены в консоль;
        // - Переменная в цикле носит простое значение, например, буквенное i.

        Task_2();
        // Задание 2
        //С помощью цикла for выведите в консоль все числа от 10 до 1.

        //Подсказка
        //Чтобы цикл "шел в обратную сторону", вместо операции сложения используйте операцию вычитания.

          //      Критерии оценки
        // - Использован цикл for;
        // - Все значение от 10 до 1 выведены в консоль;
        // - Переменная в цикле носит простое значение, например, буквенное i.

        Task_3();
        //Задание 3
        //Выведите в консоль все четные числа от 0 до 17.

        //Подсказка
        //Четными числами считаются числа, которые делятся на 2 без остатка. В нашем случае к нулю нужно прибавлять 2, тогда все цифры будут четными.

        //Критерии оценки
        // - Использован цикл for для решения задачи
        // - В консоль выведены все четные числа

        Task_4();
        //Задание 4
        //Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.

        //        Подсказка
        // Чтобы цикл "шел в обратную сторону", вместо операции сложения используйте операцию вычитания"

        //Критерии оценки:
        // - Использован цикл for для решения задачи
        // - В консоль выведены все цифры от 10 до - 10 в убывающем порядке

        Task_5();
        //Задание 1
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате "… год является високосным".



          //      Подсказка
        //Високосным является год, четвертый по счету и делящийся на 4 без остатка. В нашем случае, это все года, начиная с 1904 года и далее каждые четвертые по счету.

          //      Критерии оценки
        // - Применен цикл for для решения задания
        // - В консоль выводятся все даты года с 1904 по 2096, являющиеся високосными
        // - В консоль результат выведен в формате "… год является високосным".

        Task_6();

        Task_7();
        Task_8();
        Task_9();
    }

    public static void Task_1() {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void Task_2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void Task_3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void Task_4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void Task_5() {
        System.out.println("Задача 2_1");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void Task_6() {
        System.out.println("Задача 2_2");
        //Задание 2
        //Напишите программу, которая выводит в консоль последовательность цифр:

        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98

        //Подсказка
        //Если проследить, то каждое следующее число в данном последовательно больше следующего на 7

        //Критерии оценки
        // - Применен цикл for для решения задания
        // - В консоль выводятся все цифры последовательности

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void Task_7() {
        System.out.println("Задача 2_3");
        //Задание 3
        //Напишите программу, которая выводит в консоль последовательность цифр:

        // 1 2 4 8 16 32 64 128 256 512

        //Подсказка
        //Подсказка 2
        // Сначала нужно вывести в консоль цифру 1, а далее с помощью цикла вывести все остальные числа

        //Критерии оценки
        // - Применен цикл for для решения задания
        // - В консоль выводятся все цифры последовательности
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void Task_8() {
        System.out.println("Задача 3_1");
        // Задание 1

        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей “в банку”.

        //Выведите сумму накоплений за каждый месяц в консоль в формате “Месяц … , сумма накоплений равна … рублей” .

        // Критерии проверки:
        // - Применен цикл for для решения задания
        // - В консоль выводится по порядку суммы накоплений за каждый месяц
        // - Инициализирована переменная для обозначения вклада
        // - Инициализирована переменная для суммы накоплений

        int salary = 29_000;
        int total = 0;

        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма нокоплений равна " + total + " рублей");
        }
    }

    public static void Task_9() {
        System.out.println("Задача 3_2");
        // Задание 2

        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не “в банку”,
        // а в банк под проценты – 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате “Месяц … , сумма накоплений равна … рублей” .

        //- Подсказка
        //
        //    12% годовых – 1% от суммы каждый месяц
        //
        //- Критерии проверки:
        //    - Применен цикл for для решения задания
        //    - В консоль выводится по порядку суммы накоплений за каждый месяц с учетом % по вкладу
        //    - Инициализирована переменная для обозначения вклада
        //    - Инициализирована переменная для суммы накоплений

        int salary = 29_000;
        int total = 0;

        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма нокоплений равна " + total + " рублей");
        }
    }
}