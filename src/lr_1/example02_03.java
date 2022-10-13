package lr_1;

public class example02_03 {

    public static void main(String[] args)
    {
        int S, D;
        S = 10;
        D = 20;
        if (S < D) System.out.printf("S < D\n");
        S = S * 2;
        if (S == D) System.out.printf("S = D\n");
        S = S * D;
        if(S > D) System.out.printf("S > D\n");
    }
}
