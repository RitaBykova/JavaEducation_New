package lr_1;

import java.util.Scanner;

public class example02_10{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("День недели: ");
        String day = in.nextLine();

        System.out.print("Месяц: ");
        String month = in.nextLine();

        System.out.print("Дата: ");
        int date = in.nextInt();

        if (date > 31){System.out.print("В месяце не может быть больше, чем 31 день\n");}
        else {System.out.printf("Сегодня %s %s %d \n", day, month, date);}
        in.close();
    }
}