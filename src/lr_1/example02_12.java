package lr_1;

import java.util.Scanner;

public class example02_12{

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("В каком году вы родились: ");
            int year = in.nextInt();

            System.out.print("Какой сейчас год: ");
            int ynow = in.nextInt();

            System.out.printf("Ваш возраст: %d \n",(ynow - year));
        }
    }

