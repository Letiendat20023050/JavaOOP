import java.util.ArrayList;

public class App16 {
      public static void main(String[] args) {
        // Khai báo 1 ArrayList có tên là arrListString
        // có kiểu là String
        ArrayList<String> arrayListString = new ArrayList<>();

        // them cac pahn tu su dung phuong thuc add()
        arrayListString.add("Java");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");

        //duyet theo kich thuoc cua arrListString
        // su dung vong lap for thong thuong
        // phuong thuc arrListString.size() se tra ve so phan tu cua arrListString
        // va sau do lay phan tu tai vi tri thu i thong qua ham get()
        // sau do hien thi gia tri phan tu do ra
        System.out.println("Cac phan thu co trong arrListString la: ");
        for (int i = 0; i< arrayListString.size(); i++) {
            System.out.print(arrayListString.get(i) + "\t");
    }  
}
}
