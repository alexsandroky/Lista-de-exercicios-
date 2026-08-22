import java.util.Scanner;
class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.println("A idade da pessoa é: " + idade + " anos");
        scanner.close();
    }
}