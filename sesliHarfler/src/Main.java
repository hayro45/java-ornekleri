public class Main {

    public static void main(String[] args) {
	    String harf = "A";

	    String[][] sesliHarfler = new String[2][4];
	    sesliHarfler[0][0] = "A";
	    sesliHarfler[0][1] = "I";
	    sesliHarfler[0][2] = "O";
	    sesliHarfler[0][3] = "U";

	    sesliHarfler[1][0] = "E";
	    sesliHarfler[1][1] = "İ";
	    sesliHarfler[1][2] = "Ö";
	    sesliHarfler[1][3] = "Ü";


	    for (int j=0; j<=1; j++){
	        for (int i=0; i<=3; i++){
	            if(harf==sesliHarfler[j][i] && j==0){
					System.out.println("Harfiniz kalın sesli ünlü bir harf olup "+harf+" 'dir.");

	            }else if (harf==sesliHarfler[j][i] && j==1){
	            	System.out.println("Harfiniz ince sesli bir harf olup "+harf+"'dir.");
				}

            }

			System.out.println("");
        }
    }
}
