import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        int toplam = 0;
        int sayi;


        while (true) {
            System.out.print("Bir sayi giriniz: ");
            sayi = input.nextInt();
            if (sayi % 2 == 1) {
                break;
            }
            else if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
                System.out.println("Sayi: " + sayi);
            }
        }
        System.out.println("Girilen sayilarin toplami: " + toplam);

    }
}
