import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        
        if (verificarPertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }
    
    public static boolean verificarPertenceFibonacci(int numero) {
        int anterior = 0;
        int atual = 1;
        
        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        
        return atual == numero;
    }
}
