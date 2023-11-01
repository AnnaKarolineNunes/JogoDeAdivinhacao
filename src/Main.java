import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero entre 0 e 100 ");
            int numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado ){
                System.out.println("Parabens voce acertou o numero gerado");
                break;
            }else if (numeroDigitado < numeroGerado){
                System.out.println("O numero digitado é menor que o numero gerado");
            }else{
                System.out.println("O numero digitado é maior que o numero gerado.");
            }
        }
        if (tentativas == 5){
            System.out.println("Voce nao conseguiu adivinhar o numero");
        }
    }
}
