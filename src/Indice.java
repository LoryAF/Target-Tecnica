public class Indice {
    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 1;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("A soma do valor da variável soma é: " + soma); // Imprime 77
    }
}
