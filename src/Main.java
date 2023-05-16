import java.util.Scanner;

public class Main {
    // recursive üst alma fonksiyonu
    static int power(int base, int pow) {

        // taban 1 veya üs 0 a eşitse direkt bir dönürür
        if (base == 1 || pow == 0) {
            return 1;
        }
        // burada taban değer ile bu fonksiyondan çıkacak değer çarpılır ve her seferinde fonksiyona üs değeri bir eksik verirlir
        // yani taban her seferinde yine tabanla çarpılır
        return base * power(base, pow - 1);


    }

    public static void main(String[] args) {
        int base, pow;

        //kullanıcıdan veri alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz:  ");
        base = input.nextInt();

        //kullanıcıdan veri alınır
        System.out.print("Üs değerini giriniz: ");
        pow = input.nextInt();

        System.out.println(power(base, pow));
    }
}