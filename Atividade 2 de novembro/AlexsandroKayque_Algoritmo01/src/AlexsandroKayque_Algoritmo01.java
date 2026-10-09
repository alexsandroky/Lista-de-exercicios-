import java.util.Scanner;

class AlexsandroKayque_Algoritmo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;

        if (quantidade < 12) {
            precoUnitario = 1.30;
        } else {
            precoUnitario = 1.00;
        }

        double total = quantidade * precoUnitario;

        System.out.printf("Custo total: R$ %.2f%n", total);

        scanner.close();
    }
}





public class AlexsandroKayque_Algoritmo01 {
    // Exemplo 2 com o operador ternario

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double precoUnitario = (quantidade < 12) ? 1.30 : 1.00;
        double total = quantidade * precoUnitario;

        System.out.printf("Custo total: R$ %.2f%n", total);

        scanner.close();
    }
}



