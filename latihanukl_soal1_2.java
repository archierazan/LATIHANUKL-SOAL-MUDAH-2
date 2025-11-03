import java.util.Scanner;
public class latihanukl_soal1_2 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        //SOAL 2 DI SOAL MUDAH
        System.out.print("masukan bilangan : ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}