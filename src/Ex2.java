import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número a ser verificado: ");
        int check = scanner.nextInt();
        scanner.close();

        int ant = 0;
        int pos = 1;

        while (ant < check) {
            int soma = ant + pos;
            ant = pos;
            pos = soma;
        }

        if (ant == check) {
            System.out.println(check + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(check + " não pertence à sequência de Fibonacci.");
        }


    }
}
