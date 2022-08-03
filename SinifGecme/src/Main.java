import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //
        //Geçme Notu : 55
        //
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

        int mat,fiz,turk,kim,muz;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu girin : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunu girin : ");
        fiz = inp.nextInt();

        System.out.print("Türkçe notunu girin : ");
        turk = inp.nextInt();

        System.out.print("Kimya notunu girin : ");
        kim = inp.nextInt();

        System.out.print("Müzik notunu girin : ");
        muz = inp.nextInt();

        double ort = (mat + fiz + turk + kim + muz) / 5 ;

        if(ort >= 55 ) {
            System.out.println("Sınıfı geçtiniz : " + ort);

        }    else {
                System.out.println("Kaldınız : " +ort);

            }





    }




    }
