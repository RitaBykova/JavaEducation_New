package lr_1;
import java.util.Scanner;
public class example02_16
{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        int num2;
        num2 = num - 1;

        int num3;
        num3 = num + 1;

        int num4;
        num4= num + num2 + num3 * 2;

        System.out.printf("Number output: %d %d %d %d \n", num2, num, num3, num4);
    }
}
