import java.util.Random;
public class teste {
    public static void main(String[] args) {

        Random generate = new Random();
        int j = 0;
        while (j < 6) {
            int number = generate.nextInt(60);
            j++;
            System.out.println(number);
        }


    }
}
