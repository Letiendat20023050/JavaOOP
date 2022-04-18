package App79;
public class nhanvien{
    protected String ten;
    protected long luong;

    public nhanvien(){

    }
    public NhanVien(String ten){
        this.ten = ten;
    }
    protected String loainhanvien(){
        return "";
    }

    public void xuatThongTin(){
        System.out.println("=== nhan vien : "+ ten +" ===");
        System.out.println("= Loai nhan vien: "+ loainhanvien());
        System.out.println("= Luong : "+ luong + " VND");
    }
}