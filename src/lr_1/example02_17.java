package lr_1;
import java.util.Scanner;
public class example02_17
{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        int num3;
        num3 = num + num2;
        System.out.printf("Сумма чисел: %d \n", num3);

        int num4;
        num4 = num - num2;
        System.out.printf("Разность чисел: %d \n", num4);
    }
}
