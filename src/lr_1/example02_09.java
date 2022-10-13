package lr_1;

import java.util.Scanner;

public class example02_09{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String name = in.nextLine();

        System.out.print("Ваш возраст: ");
        int age = in.nextInt();

        System.out.printf("Имя: %s Возраст: %d \n", name, age);
        in.close();
    }
}

