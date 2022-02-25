import java.util.Scanner;
public class Trang25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=0;
        double h=0;
        try {
            System.out.println("Can nang: ");
        w =sc.nextInt();
        System.out.println("Chieu cao theo m: ");
        h =sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu !");
        }
        double BMI = w/(h*h);
        if (BMI <18.5) {
            System.out.println("Underweight");
        } else if (BMI >18.5 && BMI <25.0 ) {
            System.out.println("Normal");
        } else if (BMI >25.0 && BMI <30.0 ) {
            System.out.println("Overweight");
        } if (BMI > 30.0) {
            System.out.println("Obese");
        }
    }
}