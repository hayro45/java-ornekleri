public class Main {

    public static void main(String[] args) {
        int sayi = 2;

        int bolenler=0;
        for (int i=1; i<sayi;i++){
            if (sayi % i == 0){
                bolenler+=i;
            }
        }

        if (sayi == bolenler) {
            System.out.println("sayı mükemmel");
        }else {
            System.out.println("Sayı mükemmel değil");
        }
    }
}
