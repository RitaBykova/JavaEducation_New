package lr_1;

import java.util.Scanner;

public class example02_14
{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        int ynow = 2022;

        System.out.printf("Год вашего рождения: %d \n",(ynow - age));
    }
}