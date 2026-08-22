import java.util.Scanner;
class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacao = scanner.nextDouble();
        System.out.print("Digite o valor em dólares: ");
        double valorDolares = scanner.nextDouble();
        double valorReais = valorDolares * cotacao;
        System.out.println("O valor em reais é: R$ " + valorReais);
        scanner.close();
    }
}


Outra versão

import java.util.Scanner;
class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cotacao = 5.25;
        // Valor ja salvo na variavel do dolar atual!
        System.out.print("Digite o valor em dólares: ");
        double valorDolares = scanner.nextDouble();
        // Calcula o valor equivalente em reais (dólares x cotação)
        double valorReais = valorDolares * cotacao;
        System.out.println("O valor em reais é: R$ " + valorReais);
        scanner.close();
    }
}
