import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so phan tu trong mang: ");
        n=scanner.nextInt();

        int []a= new int[n];

        for (int i = 0; i < n; i++){        
        System.out.println("nhap cac phan tu: ");
        a[i] = scanner.nextInt();
        }

        int sum= 0;
        for ( int i = 0; i<a.length; i++)
        {
            if ( a[i] % 2 == 0 )
            {
                sum = sum + a[i];
            }
        }

        System.out.println("sum = "+sum);
    }
}