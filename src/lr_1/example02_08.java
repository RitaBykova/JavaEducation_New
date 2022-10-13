package lr_1;

import java.util.Scanner;

public class example02_08{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Ваша фамилия: ");
        String familia = in.nextLine();

        System.out.print("Ваше имя: ");
        String name = in.nextLine();

        System.out.print("Ваше отчество: ");
        String otchestvo = in.nextLine();

        System.out.printf("Hallo %s %s %s \n", familia, name, otchestvo);
        in.close();
    }
}
