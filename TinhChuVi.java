import java.util.Scanner;
public class TinhChuVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Nhap r: ");
        try {
            r = sc.nextDouble();
            System.out.println("Chu Vi: "+(r * 2 *3.14));
        } catch (Exception e) {
            System.out.println("ban nhap sai du lieu !");
        }
    }
}
