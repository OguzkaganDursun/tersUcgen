import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degisken tanimlandi.
        int satirSayisi;

        //Kullanicidan veri alindi ve islem yapilarak ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);
        System.out.print("Satir Sayisini Giriniz : ");
        satirSayisi = scan.nextInt();

        for (int i = 1; i <= satirSayisi; i++)
        {
            for (int k = 1; k <= i; k++)
            {
                System.out.print(" ");
            }

            for (int j = -1; j <= (2 * satirSayisi - ((2*i) + 1) ); j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
