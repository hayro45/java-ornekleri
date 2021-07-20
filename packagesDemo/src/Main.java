//import matematik.DortIslem;
//import matematik.Logaritma;
import matematik.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınız: ");

        String isim = scanner.nextLine();

        System.out.println("Merhaba " + isim);

        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(1,2));
        Logaritma logaritma = new Logaritma();
    }
}
