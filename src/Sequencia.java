public class Sequencia {

    public static void main(String[] args) {
        System.out.println("Próximo elemento da sequência a): " +  SequenciaA());
        System.out.println("Próximo elemento da sequência b): " + SequenciaB());
        System.out.println("Próximo elemento da sequência c): " + SequenciaC());
        System.out.println("Próximo elemento da sequência d): " + SequenciaD());
        System.out.println("Próximo elemento da sequência e): " + SequenciaE());
        System.out.println("Próximo elemento da sequência f): " + SequenciaF());
    }

    public static int SequenciaA(){
        int[] numeros = {1, 3, 5, 7};
        int proximo = numeros[numeros.length - 1] + 2; // O próximo número é o último + 2

        return proximo;
    }

    public static int SequenciaB(){
        int[] numeros = {2, 4, 8, 16, 32, 64};
        int proximo = numeros[numeros.length - 1] * 2; // O próximo número é o último * 2

        return proximo;
    }

    public static int SequenciaC(){
        int[] numeros = {0, 1, 4, 9, 16, 25, 36};
        int proximo = (int) Math.pow(numeros.length, 2); // O próximo número é o quadrado do índice

        return proximo;
    }

    public static int SequenciaD(){
        int[] numeros = {4, 16, 36, 64, 100};
        int proximo = (int) Math.pow(numeros.length * 2, 2); // O próximo número é o quadrado do próximo número par

        return proximo;
    }

    public static int SequenciaE(){
        int[] fibonacci = {1, 1, 2, 3, 5, 8};
        // O próximo número é a soma dos dois anteriores
        int proximo = fibonacci[fibonacci.length - 1] + fibonacci[fibonacci.length - 2];

        return proximo;
    }

    public static int SequenciaF(){
        int[] numeros = {2, 10, 12, 16, 17, 18, 19};
        int proximo = 0;

        // A lógica parece ser: após 2, 10, (10 + 2 = 12), (12 + 4 = 16), (16 + 1 = 17),
        // (17 + 1 = 18), (18 + 1 = 19)
        // O próximo número deve ser 20.
        proximo = 19 + 1; // Incrementar 1 para o próximo número

        return proximo;
    }

}
