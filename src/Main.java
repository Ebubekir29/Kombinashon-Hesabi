import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n,r,nFaktoriyel = 1,rFaktoriyel=1,nrFaktoriyel=1,kombinasyon;
        System.out.print("n sayisini girin : ");
        n = scan.nextInt();
        System.out.print("r sayisini girin : ");
        r = scan.nextInt();
        for(int i = 1;i<=n;i++)
        {
            nFaktoriyel *=i;
        }
        for (int i =1;i<=r;i++)
        {
            rFaktoriyel*=i;
        }
        for (int i = 1;i<=(n-r);i++)
        {
            nrFaktoriyel*=i;
        }
        kombinasyon = nFaktoriyel/(rFaktoriyel*nrFaktoriyel);
        System.out.println(kombinasyon);
    }
}
