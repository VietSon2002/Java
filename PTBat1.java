import java.util.Scanner;
public class PTBat1{
    public static void main(String[] args) {
        double t;
        double a=0;
        double b=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap so a: ");
            a = sc.nextDouble();
            System.out.println("Nhap so b: ");
            b = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu: ");
        }
        if( a == 0 ){
            if( b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }  else {
            t = -b / a;
            System.out.println("Phuong trinh co nghiem la: "+t);
        }
    }
}