import java.util.Scanner;
public class hinhtron {
    public static void main(String[] args) throws Exception {
     HinhTron ht = new HinhTron();
    }
}
    class HinhTron
    {
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;

        void nhapBanKinh()
        {
            System.out.println("nhap ban kinh: ");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextFloat();
        }
        void tinhChuVi()
        {
            cv = 2 * PI *r;
        }
        void tinhDientich()
        {
            dt = PI * r * r;
        }
        void inChuVi()
        {
            System.out.println("chu vi hinh tron "+cv);
        }
        void inDientich()
        {
            System.out.println("dien tich hinh tron: "+dt);
        }  
    }
