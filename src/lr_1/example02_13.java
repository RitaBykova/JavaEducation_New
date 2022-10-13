package lr_1;

import java.util.Scanner;

public class example02_13{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите ваш год рождения: ");
        int year = in.nextInt();

        int ynow = 2022;

        System.out.printf("Вы %s и вам %d\n",name, (ynow - year));
    }
}