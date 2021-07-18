public class Main {

    public static void main(String[] args) {
	    int sayi1 = 220;
	    int sayi1bolenler=0;

	    int sayi2 = 284;
        int sayi2bolenler=0;

        //sayi1 in pozitif bölenlerinin toplamı
        for (int i=1;i<sayi1;i++){
            if (sayi1%i==0) {
                sayi1bolenler+=i;
            }
        }

        //sayi2 nin pozitif bölenlerinin toplamı
        for (int i=1;i<sayi2;i++){
            if (sayi2%i==0) {
                sayi2bolenler+=i;
            }
        }
        System.out.println(sayi1bolenler);
        System.out.println(sayi2bolenler);
        //biribirine eşitse...
        if (sayi2==sayi1bolenler && sayi1==sayi2bolenler){
            System.out.println("Bu iki sayınız arkadaşlar");
        }else {
            System.out.println("Bu iki sayı birbirini tanımıyor");
        }

    }
}
