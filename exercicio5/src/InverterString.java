import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String entrada = scanner.nextLine();
        
        String invertida = inverterString(entrada);
        
        System.out.println("String original: " + entrada);
        System.out.println("String invertida: " + invertida);
    }
    
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;
        
        while (esquerda < direita) {
            // Trocar os caracteres de posição
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            
            // Avançar para os próximos caracteres
            esquerda++;
            direita--;
        }
        
        return new String(caracteres);
    }
}
