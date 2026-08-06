import java.util.Random;

public class Startup {
    public static void main(String[] args) {
        Random rand = new Random();
        int numero = rand.nextInt(10);
        System.out.println(numero);
    }
}
