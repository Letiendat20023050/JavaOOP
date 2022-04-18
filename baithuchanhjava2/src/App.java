import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // doi tuong su dung de nhap xuat du lieu trong Java
        Scanner sc = new Scanner(System.in);
        //khai bao 1 bien de chua gia tri nhap vao tu ban phim
        String strHoTen ="";
        //thong bap cho nguoi dung biet can nhap vao ho ten
        System.out.println("Nhap ho ten:");
        //gan gia tri nhap tu ban phim cho bien strHoTen
        strHoTen = sc.nextLine();
        System.out.println("Xin chao" + strHoTen);
    }
}
