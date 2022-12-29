import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritma {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int [] a= new int [3];
        int b=0;
        Deneme d=null;

        System.out.println("Program basladi...");

        try {
            b=2/0;
        }catch (ArithmeticException e) {
            System.out.println("0'a bolme hatasi var!");
        }
        try {
            a[4]=12;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dizi index asimi hatasi var!");
        }
        try {
            System.out.println(d.getX());
        }catch (NullPointerException e){
            System.out.println("Null hatasi var!");
        }
        try {
            System.out.print("Sayi gir: ");
            s.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Veri girisi hatasi var!");
        }
        finally{
            System.out.println("Program bitti...");
        }
    }
}
