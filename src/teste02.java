import java.util.Scanner;
public class teste02 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("digite um n");
            int n = sc.nextInt();
            System.out.println("digite outro numero");
            int n1 = sc.nextInt();
            int s = (n + n1) % 2;
            System.out.println(s);

            if (s == 0) {
                System.out.println("a soma da par");
            } else if (s == 1) {
                System.out.println("a soma e impar");
            }

            sc.close();



    }

}
