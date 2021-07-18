public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava cok güzel.";
        String newMessage = message.substring(0,2);

        System.out.println(newMessage);

        ekle();
        sil();
        guncelle();
        yaz(Integer.toString(topla(1,2)));

    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Sildim");
    }

    public static void guncelle(){
        System.out.println("Güncelledim");
    }

    public static void yaz(String mesaj){
        System.out.println(mesaj);
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar){
            return toplam += sayi;
        }
        return toplam;
    }

}
