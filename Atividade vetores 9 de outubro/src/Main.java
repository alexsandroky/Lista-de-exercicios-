import java.util.Random;
import java.util.Scanner;

class AlexsandroKayque_Algoritmo01 {
    static Scanner teclado = new Scanner(System.in);
    static Random sorteador = new Random();

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.print("\nDigite o número do algoritmo (1 a 20) ou 0 para sair: ");
            opcao = teclado.nextInt();
            System.out.println();
            executarAlgoritmo(opcao);
        }

        teclado.close();
    }

    // Chama o algoritmo escolhido no menu
    static void executarAlgoritmo(int numero) {
        switch (numero) {
            case 1: algoritmo01(); break;
            case 2: algoritmo02(); break;
            case 3: algoritmo03(); break;
            case 4: algoritmo04(); break;
            case 5: algoritmo05(); break;
            case 6: algoritmo06(); break;
            case 7: algoritmo07(); break;
            case 8: algoritmo08(); break;
            case 9: algoritmo09(); break;
            case 10: algoritmo10(); break;
            case 11: algoritmo11(); break;
            case 12: algoritmo12(); break;
            case 13: algoritmo13(); break;
            case 14: algoritmo14(); break;
            case 15: algoritmo15(); break;
            case 16: algoritmo16(); break;
            case 17: algoritmo17(); break;
            case 18: algoritmo18(); break;
            case 19: algoritmo19(); break;
            case 20: algoritmo20(); break;
            case 0: System.out.println("Encerrando..."); break;
            default: System.out.println("Opção inválida.");
        }
    }

    //  ALGORITMO 01
    // Preenche um vetor com 10 inteiros e mostra os primos e suas posições
    static void algoritmo01() {
        int[] numeros = lerVetorInteiros(10, "Digite o número");

        System.out.println("Números primos e suas posições:");
        for (int posicao = 0; posicao < numeros.length; posicao++) {
            if (ehPrimo(numeros[posicao])) {
                System.out.println(numeros[posicao] + " na posição " + posicao);
            }
        }
    }

    // ALGORITMO 02
    // Preenche dois vetores de 10 elementos e mostra o vetor intercalado
    static void algoritmo02() {
        int[] vetorA = lerVetorInteiros(10, "Vetor A - elemento");
        int[] vetorB = lerVetorInteiros(10, "Vetor B - elemento");
        int[] intercalado = new int[vetorA.length + vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
            intercalado[i * 2] = vetorA[i];
            intercalado[i * 2 + 1] = vetorB[i];
        }

        imprimirVetor("Vetor intercalado", intercalado);
    }

    //  ALGORITMO 03
    // Cria um vetor com 10 inteiros aleatórios e calcula a média
    static void algoritmo03() {
        int[] numeros = gerarVetorAleatorio(10, 1, 100);

        imprimirVetor("Vetor", numeros);
        System.out.println("Média: " + calcularMedia(numeros));
    }

    // ALGORITMO 04
    // Cria um vetor com 20 aleatórios (1 a 30) e verifica se o 25 existe
    static void algoritmo04() {
        int[] numeros = gerarVetorAleatorio(20, 1, 30);
        int indice = encontrarIndice(numeros, 25);

        imprimirVetor("Vetor", numeros);
        if (indice != -1) {
            System.out.println("O número 25 existe no vetor.");
        } else {
            System.out.println("O número 25 não existe no vetor.");
        }
    }

    // ALGORITMO 05
    // Cria um vetor com 15 aleatórios (1 a 50) e mostra o índice do 20
    static void algoritmo05() {
        int[] numeros = gerarVetorAleatorio(15, 1, 50);
        int indice = encontrarIndice(numeros, 20);

        imprimirVetor("Vetor", numeros);
        if (indice != -1) {
            System.out.println("O número 20 está no índice " + indice);
        } else {
            System.out.println("O número 20 não existe no vetor.");
        }
    }

    // ALGORITMO 06
    // Cria um vetor com 30 aleatórios (1 a 100) e remove o valor digitado
    static void algoritmo06() {
        int[] numeros = gerarVetorAleatorio(30, 1, 100);
        imprimirVetor("Vetor", numeros);

        int valor = lerInteiro("Digite um valor: ");
        int indice = encontrarIndice(numeros, valor);

        if (indice == -1) {
            System.out.println("O valor não existe no vetor.");
        } else {
            int[] semOValor = removerPosicao(numeros, indice);
            imprimirVetor("Vetor sem o valor", semOValor);
        }
    }

    // ALGORITMO 07
    // Lê 5 números decimais e mostra o maior e o menor
    static void algoritmo07() {
        double[] valores = lerVetorDecimais(5, "Digite o valor");

        System.out.println("Maior valor: " + encontrarMaior(valores));
        System.out.println("Menor valor: " + encontrarMenor(valores));
    }

    //  ALGORITMO 08
    // Gera o vetor A com 15 inteiros e cria o vetor B como cópia reversa
    static void algoritmo08() {
        int[] vetorA = gerarVetorAleatorio(15, 1, 100);
        int[] vetorB = inverterVetor(vetorA);

        imprimirVetor("Vetor A", vetorA);
        imprimirVetor("Vetor B", vetorB);
    }

    //  ALGORITMO 09
    // Imprime os recibos de 1 até a quantidade desejada usando while
    static void algoritmo09() {
        int quantidade = lerInteiro("Quantidade de recibos: ");

        int recibo = 1;
        while (recibo <= quantidade) {
            System.out.println("Recibo " + recibo);
            recibo++;
        }
    }

    //  ALGORITMO 10
    // Mostra a tabuada de um número até 10
    static void algoritmo10() {
        int numero = lerInteiro("Digite o número da tabuada: ");

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
        }
    }

    //  ALGORITMO 11
    // Lê 10 temperaturas e mostra a média
    static void algoritmo11() {
        double[] temperaturas = lerVetorDecimais(10, "Temperatura");

        System.out.println("Temperatura média: " + calcularMedia(temperaturas));
    }

    //  ALGORITMO 12
    // Imprime os números pares de 1 a 50
    static void algoritmo12() {
        System.out.println("Números pares de 1 a 50:");

        for (int numero = 1; numero <= 50; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

    //  ALGORITMO 13
    // Imprime todos os primos menores ou iguais a N
    static void algoritmo13() {
        int limite = lerInteiro("Digite um número inteiro N: ");

        System.out.println("Primos menores ou iguais a " + limite + ":");
        for (int numero = 2; numero <= limite; numero++) {
            if (ehPrimo(numero)) {
                System.out.println(numero);
            }
        }
    }

    //  ALGORITMO 14
    // Calcula o tempo total de produção com base no número de etapas
    static void algoritmo14() {
        int horasPorEtapa = 2;
        int etapas = lerInteiro("Número de etapas de produção: ");

        int tempoTotal = etapas * horasPorEtapa;
        System.out.println("Tempo total de produção: " + tempoTotal + " horas");
    }

    // ALGORITMO 15
    // Imprime os N primeiros termos da sequência de Fibonacci
    static void algoritmo15() {
        int quantidade = lerInteiro("Digite um número inteiro positivo N: ");
        long termoAnterior = 0;
        long termoAtual = 1;

        System.out.println("Primeiros " + quantidade + " termos de Fibonacci:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(termoAnterior + " ");

            long proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
        System.out.println();
    }

    //  ALGORITMO 16
    // Lê 5 respostas e imprime na ordem inversa
    static void algoritmo16() {
        int[] respostas = lerVetorInteiros(5, "Resposta");

        System.out.println("Respostas na ordem inversa:");
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println(respostas[i]);
        }
    }

    //  ALGORITMO 17
    // Lê as notas de 10 alunos e mostra a média
    static void algoritmo17() {
        double[] notas = lerVetorDecimais(10, "Nota do aluno");

        System.out.println("Média das notas: " + calcularMedia(notas));
    }

    //  ALGORITMO 18
    // Lê 8 temperaturas e mostra a maior
    static void algoritmo18() {
        double[] temperaturas = lerVetorDecimais(8, "Temperatura");

        System.out.println("Maior temperatura: " + encontrarMaior(temperaturas));
    }

    // ALGORITMO 19
    // Verifica se um código digitado existe em um vetor pré-definido
    static void algoritmo19() {
        int[] codigosCadastrados = {101, 205, 330, 412, 518, 624, 737, 845};
        int codigo = lerInteiro("Digite o código do produto: ");

        if (encontrarIndice(codigosCadastrados, codigo) != -1) {
            System.out.println("Produto encontrado.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // ALGORITMO 20
    // Lê 10 preços, ordena em ordem crescente e imprime
    static void algoritmo20() {
        double[] precos = lerVetorDecimais(10, "Preço do produto");

        ordenarCrescente(precos);

        System.out.println("Preços em ordem crescente:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println(precos[i]);
        }
    }

    // MÉTODOS AUXILIARES

    // Mostra a mensagem e lê um número inteiro
    static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return teclado.nextInt();
    }

    // Mostra a mensagem e lê um número decimal
    static double lerDecimal(String mensagem) {
        System.out.print(mensagem);
        return teclado.nextDouble();
    }

    // Lê vários inteiros e guarda em um vetor
    static int[] lerVetorInteiros(int tamanho, String descricao) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = lerInteiro(descricao + " " + (i + 1) + ": ");
        }
        return vetor;
    }

    // Lê vários decimais e guarda em um vetor
    static double[] lerVetorDecimais(int tamanho, String descricao) {
        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = lerDecimal(descricao + " " + (i + 1) + ": ");
        }
        return vetor;
    }

    // Cria um vetor com inteiros aleatórios entre o mínimo e o máximo
    static int[] gerarVetorAleatorio(int tamanho, int minimo, int maximo) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sorteador.nextInt(maximo - minimo + 1) + minimo;
        }
        return vetor;
    }

    // Imprime um vetor de inteiros em uma linha
    static void imprimirVetor(String titulo, int[] vetor) {
        System.out.print(titulo + ": ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    // Verifica se um número é primo
    static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // Retorna a posição do valor no vetor, ou -1 se não existir
    static int encontrarIndice(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Cria um novo vetor sem o elemento da posição informada
    static int[] removerPosicao(int[] vetor, int posicao) {
        int[] novoVetor = new int[vetor.length - 1];
        int novaPosicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (i != posicao) {
                novoVetor[novaPosicao] = vetor[i];
                novaPosicao++;
            }
        }
        return novoVetor;
    }

    // Cria um novo vetor com os elementos em ordem reversa
    static int[] inverterVetor(int[] vetor) {
        int[] invertido = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            invertido[i] = vetor[vetor.length - 1 - i];
        }
        return invertido;
    }

    // Calcula a média de um vetor de inteiros
    static double calcularMedia(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return (double) soma / vetor.length;
    }

    // Calcula a média de um vetor de decimais
    static double calcularMedia(double[] vetor) {
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
    }

    // Retorna o maior valor do vetor
    static double encontrarMaior(double[] vetor) {
        double maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    // Retorna o menor valor do vetor
    static double encontrarMenor(double[] vetor) {
        double menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    // Ordena o vetor em ordem crescente (bubble sort)
    static void ordenarCrescente(double[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double auxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar;
                }
            }
        }
    }
}