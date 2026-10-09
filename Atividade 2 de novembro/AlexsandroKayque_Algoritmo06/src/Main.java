import java.util.Scanner;

public class AlexsandroKayque_Algoritmo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int Idade = scanner.nextInt();

        if (Idade >= 18) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        scanner.close();
    }
}






import java.util.Scanner;

public class AlexsandroKayque_Algoritmo06 {
    public static void main(String[] args) {
        //exemplo 2 com operador ternario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int Idade = scanner.nextInt();

        String Mensagem = (Idade >= 18) ? "A pessoa é maior de idade." : "A pessoa é menor de idade.";
        System.out.println(Mensagem);

        scanner.close();
    }
}