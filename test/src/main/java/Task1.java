public class Task1 {
    //посчитать факториал числа n
//0.5 балла - если посчитаете в цикле
//1 балл - если посчитаете рекурсией
    public static int fact(int n) {
        for (int i = n - 1; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    //вывести таблицу умножения на экран - 1 балл
//подсказка - использовать двойной for
    public static void table() {
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j);
                System.out.print("x");
                System.out.print(i);
                System.out.print("=");
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println(";");

        }
    }

    //посчитать сумму цифр числа
//можно посчитать для трехзначного - 0.5 балла
//для любого числа - 1 балл
//подсказка - в случае для любого числа используйте while
    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        n = sum;
        return n;
    }

    //определить, является ли год високосным
//В високосном году - 366 дней, тогда как в обычном - 365.
//Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
//Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
//Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
//Годы 2100, 2200 и 2300 - не високосные.
//за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 > 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //здесь вам нужно будет использовать результат прошлой задачи
//и вывести, сколько дней в году
//правильный ответ - 0.5 балла
    public static int daysInYear(int year) {
        if (isLeapYear(year)) {
            System.out.println("366");
        } else {
            System.out.println("365");
        }
        return 0;
    }

    //определить номер дня недели по строке
//например: Понедельник - 1
//правильный ответ - 1 балл
    public static int dayOfTheWeek(String n) {
        if (n.equals("Понедельник")) {
            System.out.println("Понедельник - 1");
        }
        if (n.equals("Вторник")) {
            System.out.println("Вторник - 2");
        }
        if (n.equals("Среда")) {
            System.out.println("Среда - 3");
        }
        if (n.equals("Четверг")) {
            System.out.println("Четверг - 4");
        }
        if (n.equals("Пятница")) {
            System.out.println("Пятница - 5");
        }
        if (n.equals("Суббота")) {
            System.out.println("Суббота - 6");
        }
        if (n.equals("Воскресенье")) {
            System.out.println("Воскресенье - 7");
        }
        return 0;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
//правильное решение - 0.5 балла
    public static void printArray(int[] array) {
        int a = array.length;
        System.out.print("[");
        for (int i = 0; i < a - 1; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print(array[a - 1]);
        System.out.println("]");
    }


    //вывести двойной массив на экран в виде:
// [1, 5, 3, 7, 10, 2, 5]
// [1, 5, 3, 7, 10, 2, 5]
// ...
//правильное решение - 0.5 балла
    public static void printArray(int[][] array) {
        int[] a = array[0];
        int[] b = array[1];
        int alength = a.length;
        int blength = b.length;
        System.out.print("[");
        for (int i = 0; i < alength - 1; i++) {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.print(a[alength - 1]);
        System.out.println("]");
        System.out.print("[");
        for (int i = 0 ; i < blength-1; i++)
        {
            System.out.print(b[i]);
            System.out.print(", ");
        }
        System.out.print(b[blength-1]);
        System.out.println("]");
    }



    //отсортировать одномерный массив в порядке возрастания
//если не знаете, как сортировать, то подсказка -
//метод пузырька (один из самых простых для понимания)
//правильный ответ - 1 балл
    public static int[] sort(int[] array){
        int a = array.length, b;
        for (int i = a - 1; i >= 1; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    b = array[j];
                    array[j] = array[j+1];
                    array[j+1] = b;
                }
            }
        }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }

}
