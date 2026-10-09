import java.util.Scanner;
class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê a cotação do dólar digitada pelo usuário
        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacao = scanner.nextDouble();
        // Lê o valor em dólares que o usuário possui
        System.out.print("Digite o valor em dólares: ");
        double valorDolares = scanner.nextDouble();
        // Calcula o valor da conta em reais dólares x cotação
        double valorReais = valorDolares * cotacao;
        // Exibe o resultado da conversão
        System.out.println("O valor em reais é: R$ " + valorReais);
        scanner.close();
    }
}