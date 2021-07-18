public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1,3,2,4,5,6,7,8,9};
        int arananSayi =3;

        for (int i =0;i<sayilar.length;i++){
            if(sayilar[i]==arananSayi){
                System.out.println("buldum var");
                return;
            }
        }
        System.out.println("aradığın sayi nothing");
    }
}
