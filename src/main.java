
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
			Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
		 */

		/*
		Dolay�s�yla, ilk on do�al say�n�n karelerinin toplam� ile toplam�n karesi aras�ndaki fark .

		�lk y�z do�al say�n�n karelerinin toplam� ile toplam�n karesi aras�ndaki fark� bulun.
		*/
		int kareTop=0;
		int topKare=0;
		
		for(int i=1;i<=100;i++) {
			kareTop+=i*i;
			topKare+=i;
		}
		
		topKare*=topKare;
		System.out.println(topKare);
		System.out.println(kareTop);
		System.out.println(topKare-kareTop);
	}

}
