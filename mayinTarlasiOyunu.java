
import java.util.Scanner;
import java.util.Random;

public class mayinTarlasiOyunu {
	public static int[][] haritaDoldu(int satir, int sutun)
	{
		Random rnd = new Random();
		
		int[][] matris = new int[satir][sutun];
		int i = 0;
		while(i < satir)
		{
			int j = 0;
			while(j < sutun)
			{
				matris[i][j] = rnd.nextInt();
				j = j + 1;
			}
			i = i + 1;
		}
		for(int k = 0; k < satir; k++) {
			for(int l = 0; l < sutun; l++) {
				System.out.println(matris[k][l] + " ");
			System.out.println();	
			}
		}
		return matris;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Oyunun satır boyutunu giriniz: ");
		int a = s.nextInt();
		System.out.print("Oyunun sutun boyutunu giriniz: ");
		int b = s.nextInt();
		int [][] oyunMatrisi = haritaDoldu(a,b);
		int puan = 0;
		boolean kontrol = true;
		while(kontrol)
		{
			System.out.print("Seçtiniz konumun satır değerini giriniz: ");
			int x = s.nextInt();
			System.out.print("Seçtiniz konumun sutun değerini giriniz: ");
			int y = s.nextInt();
			if(oyunMatrisi[x][y] == 1)
			{
				kontrol = false;
			}
			else
			{
				puan = puan + 10;
				System.out.println("Hala hayattasın... Devam");
			}
		}
		System.out.println("");
	}
}


           
         
