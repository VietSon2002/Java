import java.util.Scanner;
public class PTBat2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a= sc.nextDouble(),b= sc.nextDouble(),c= sc.nextDouble();
    if (a != 0) {
        double t = b * b - 4 * a * c;
        if(t < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if(t > 0){
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("X1: "+((-b+Math.sqrt(t))/2*a));
            System.out.println("X2: "+((-b-Math.sqrt(t))/2*a));
        } else{
            System.out.println("Phuong trinh co nghiem kep");
            System.out.println("X1 = X2 = "+(-b/2*a));
        }
        }  else if (b == 0){
            System.out.println("Khong phai phuong trinh bat 2");
            System.out.println("Khong phai phuong trinh nhat vo so nghiem");
    } else if (c == 0){
        System.out.println("Khong phai phuong trinh nhat vo nghiem");
    }
    }
}