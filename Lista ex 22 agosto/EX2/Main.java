import java.util.Scanner;
class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        int idadeAtual = anoAtual - anoNascimento;
        int idadeEm2050 = 2050 - anoNascimento;
        System.out.println("A idade da pessoa no ano atual é: " + idadeAtual + " anos");
        System.out.println("A idade que a pessoa terá em 2050 é: " + idadeEm2050 + " anos");
        scanner.close();
    }
}
