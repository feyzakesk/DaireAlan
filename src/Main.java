import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Yarıçapını kullanıcıdan aldığımız bir dairenin alanını ve çevresini hesaplayan programı yazınız.
        // Alan formülü = pi * r * r  Çevre formülü = 2 * pi * r

        int r ;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını girimiz : ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r ;

        System.out.println("Dairenin alani : " + alan);
        System.out.println("Dairenin cevresi : "+ cevre);

    }
}
