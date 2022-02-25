import java.util.Scanner;

public class Main {public static void main(String[] args) {
    double x , y, z,u, cevre ,alan ;
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen 1.  kenar uzunluğunu giriniz");
    x = input.nextInt();
    System.out.println("Lütfen 2.  kenar uzunluğunu giriniz");
    y = input.nextInt();
    System.out.println("Lütfen 3.  kenar uzunluğunu giriniz");
    z = input.nextInt();
    u= (x+y+z)/2;
    cevre = 2*u;
    System.out.println("Üçgenin çevre uzunluğu =" + cevre);
    alan = Math.sqrt(u * (u-x) * (u-y) * (u-z));
    System.out.println("Üçgenin alanı =" + alan );



}

}