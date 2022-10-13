package lr_1;
public class example02_18 {
    static double a =10.0, b=4.0, c, d; // доп.переменная
    public static double hyp(){
        return c = Math.sqrt(a*a + b*b); // гипотенуза
    }

    public static double hypLogo() { // нов.метод hypLogo
        return d = Math.exp(b * Math.log(a));
    }

    public static void main(String[] args) {
        System.out.println("katet а=" + a);
        System.out.println("katet b=" + b);
        System.out.println("hypotenuse с=" + hyp());
        System.out.println("natural log d=" + hypLogo());
    }
}