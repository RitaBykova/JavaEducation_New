package lr_1;

import java.util.Scanner;

public class example02_11{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        String month = in.nextLine();

        System.out.print("Введите количество дней в этом месяце: ");
        int days = in.nextInt();
        if (days > 31){System.out.print("В месяце не может быть больше, чем 31 день");}
        else {System.out.printf("%s содержит %d дней\n", month, days);}
        in.close();
    }
}
