package shapes;
import java.util.Scanner;
public class hinhtron extends hinhhoc {
	public float bankinh;
	public hinhtron() {
		ten="hinh tron";
	}
	public void nhapbankinh() {
		System.out.println("ban kinh= ");
		Scanner sc=new Scanner(System.in);
		bankinh=sc.nextFloat();
	}
	public void tinhchuvi() {
		chuvi=2*PI*bankinh;
	}
	public void tinhdientich() {
		dientich=2*PI*bankinh*bankinh;
	}
}
