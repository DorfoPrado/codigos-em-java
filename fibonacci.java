import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner valorInserido = new Scanner(System.in);
        int fibonacci = Integer.parseInt(valorInserido.next());
        int x = 0;
        int y = 1;
        int z = 0;
        boolean isFibonacci = false;
        while (z <= fibonacci) {
            z = x + y;
            x = y;
            y = z;

            if (z == fibonacci) {
                isFibonacci = true;
            }
        }
            if (isFibonacci){
            System.out.println("Pertence a sequência Fibonacci!");
            } else{
            System.out.println("Não pertence a sequência Fibonacci!");
        }
    }
}


