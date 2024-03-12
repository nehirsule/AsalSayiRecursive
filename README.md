Asal Sayı Bulma Programı
Bu program, kullanıcıdan alınan bir sayının asal olup olmadığını kontrol eder.

Kullanım
Java kurulu olmalıdır.
Java derleyici ile AsalSayi.java dosyasını derleyin:
bash
Copy code
javac AsalSayi.java
Oluşturulan AsalSayi.class dosyasını çalıştırın:
bash
Copy code
java AsalSayi
Program çalıştırıldığında, kullanıcıdan bir sayı girmesi istenir.
Girilen sayının asal olup olmadığı ekrana yazdırılır.
Ayrıntılar
Program, girilen sayının asal olup olmadığını kontrol etmek için bir recursive (özyinelemeli) fonksiyon kullanır.
Girilen sayıya kadar olan tüm bölenler kontrol edilir ve eğer bir bölen bulunursa sayı asal değil olarak değerlendirilir.
Girilen sayının asal olduğu durumda, asal olduğu ekrana yazdırılır. Aksi takdirde asal olmadığı ekrana yazdırılır.
Örnek
perl
Copy code
Bir Sayi girin : 13
Bir asal sayıdır: 13
