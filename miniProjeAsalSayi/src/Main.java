public class Main {

    public static void main(String[] args) {
	    int sayi1 = 0;
	    int kalan = sayi1 % 2;
	    System.out.println(kalan);
	    boolean asal = true;

	    if(sayi1<1){
	    	System.out.println("Geçersiz sayı");
	    	return;
		}

		if (sayi1==2){
			System.out.println("Sayı asaldır");
			return;
		}

	    for (int i=2; i<sayi1;i++){
	        if (sayi1 % i == 0){
	        	asal = false;
			}
        }
	    if (asal){
	    	System.out.println("Sayı asaldır.");
		}else{
	    	System.out.println("Sayı asal değildir");
		}

    }
}
