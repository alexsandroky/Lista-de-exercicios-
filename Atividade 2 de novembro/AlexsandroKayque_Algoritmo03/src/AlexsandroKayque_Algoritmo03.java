import java.util.Scanner;

public class AlexsandroKayque_Algoritmo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Débito: ");
        double debito = scanner.nextDouble();

        System.out.print("Crédito: ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo atual: %.2f%n", saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        scanner.close();
    }
}



import java.util.Scanner;

public class AlexsandroKayque_Algoritmo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Segundo exmemplo com operador ternario.
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Débito: ");
        double debito = scanner.nextDouble();

        System.out.print("Crédito: ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo atual: %.2f%n", saldoAtual);

        String mensagem = (saldoAtual >= 0) ? "Saldo Positivo" : "Saldo Negativo";
        System.out.println(mensagem);

        scanner.close();
    }
}