import java.util.ArrayList;
import java.util.ListIterator;

public class App18 {
    public static void main(String[] args) {
        // khai bao 1 ArrayList co ten la arrListChar
        // co kieu la Character
    ArrayList<Character> arrListChar = new ArrayList();

    arrListChar.add('a');
    arrListChar.add('e');
    arrListChar.add('b');
    arrListChar.add('c');

    //khai bao mot ListIterator co kieu la Charater
    ListIterator<Character> listIterator = arrListChar.listIterator();

    //hien thi cac phan tu trong arrListChar
    // bang cach su dung ListIterator
    System.out.println("cac phan tu co tring arrListChar la: ");
    while (listIterator.hasNext()) {
        System.out.print(listIterator.next() + "\t");
    }
}
}
