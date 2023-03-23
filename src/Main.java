import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println();
        System.out.println("Eleman Sayyısı (n): ");
        int k = inp.nextInt();
        System.out.println("Seçim Sayısı (r): ");
        int l = inp.nextInt();
        int m = k - l;
        int top = 1;
        int top2 = 1;
        int top3 = 1;

        for (int i = 1; i <= k; i++)
        {
            top = top * i;
        }
            for (int j = 1; j <= l; j++)
            {
                top2 = top2 * j;
            }
                for (int d = 1; d <= m; d++)
                {
                    top3 = top3 *d;

                }


        System.out.println(top / (top2 * (top3)));
    }
}