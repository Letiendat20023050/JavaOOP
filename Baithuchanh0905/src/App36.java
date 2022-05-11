import java.util.LinkedList;

public class App36 {
    public static void main(String[] args) {
        //khai bao 1 LinkedList co ten la list
        // co kieu la String
        LinkedList<String> list = new LinkedList<String>();
        // add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("vi du su dung phuong thuc addAll()");
        System.out.println("----------------------------------");
        // them cac phan tu cua list vao listA
        LinkedList<String> listA= new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
    
    }
}
