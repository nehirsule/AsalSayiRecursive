import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Kullanıcıdan bir tamsayı almak için Scanner sınıfını kullanıyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.print("Bir Sayi girin : ");
        int Sayi = scanner.nextInt();


        // isAsal metodunu kullanarak girilen sayının asal olup olmadığını kontrol ediyoruz
        if(isAsal(Sayi,Sayi/2)) {

            System.out.println("Bir asal sayıdır: " + Sayi);

        }

        else {

            System.out.println("Bir asal değildir: " + Sayi);

        }
    }


    // Girilen sayının asal olup olmadığını kontrol eden bir metot
    public static boolean isAsal(int sayi,int i) {

        // Temel durum: i 1 olduğunda, kontrol tamamlandı ve sayı asal
        if(i==1)  {
            return true;
        }
        else {

            // Eğer sayı i'ye bölünüyorsa, asal değildir
            if(sayi % i == 0)  {
                return false;
            }
            else {
                // Sayının diğer bölenlerini kontrol etmek için rekürsif olarak isAsal metodu çağrılır
                return isAsal(sayi, i-1);
            }
        }
    }
}