import java.util.Random;
import java.util.Scanner;
public class Trang24 {
    public static void main(String[] args) {
        Random r = new Random();
        int rd1 = r.nextInt(20)+1;
        int rd2 = r.nextInt(20)+ rd1;
        int t = rd2 -rd1;
        System.out.println("What is "+rd2+"-"+rd1);
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if (a == t ) {
                System.out.println("Correct");
            } else System.out.println("In Corret");  
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu !");
        }
    }
}