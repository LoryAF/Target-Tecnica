import java.util.Scanner;

public class ContagemLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int quantidade = contarLetraA(texto);

        if (quantidade > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + quantidade + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string informada.");
        }

        scanner.close();
    }

    public static int contarLetraA(String texto) {
        int contador = 0;
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
