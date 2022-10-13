package lr_1;

import java.util.Scanner;

public class example02_15
{

    public static void main(String[] args) {

        System.out.printf("Эта программа считает сумму двух целых чисел \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        System.out.printf("Сумма вашех чисел: %d \n",(a + b));
    }
}