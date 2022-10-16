
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

        Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/

        //Sayıyı ters cevirme

        Scanner inp = new Scanner(System.in);
        int sayi = inp.nextInt();
        int temp = sayi;
        int kalan = sayi % 10;
        int yeniSayi = kalan*10;

        while(temp != 0){
            temp = (temp - kalan) / 10;
            kalan = temp % 10;
            yeniSayi = (yeniSayi + kalan) * 10;

        }
        if (yeniSayi/100 == sayi) {
            System.out.println("Sayı palindromdur.");
        }else
            System.out.println("Sayı palindrom değildir");
    }
}
