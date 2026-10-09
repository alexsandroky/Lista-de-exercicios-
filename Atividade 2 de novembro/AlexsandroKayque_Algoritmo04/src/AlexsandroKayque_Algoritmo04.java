import java.util.Scanner;

public class AlexsandroKayque_Algoritmo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dureza: ");
        double Dureza = scanner.nextDouble();

        System.out.print("Teor de Carvão: ");
        double TeorCarvao = scanner.nextDouble();

        System.out.print("Resistência à Tração: ");
        double ResistenciaTracao = scanner.nextDouble();

        boolean Condicao1 = Dureza > 50;
        boolean Condicao2 = TeorCarvao < 0.7;
        boolean Condicao3 = ResistenciaTracao > 5600;

        int Pontuacao;

        if (Condicao1 && Condicao2 && Condicao3) {
            Pontuacao = 10;
        } else if (Condicao1 && Condicao2) {
            Pontuacao = 9;
        } else if (Condicao2 && Condicao3) {
            Pontuacao = 8;
        } else if (Condicao1 && Condicao3) {
            Pontuacao = 7;
        } else if (Condicao1 || Condicao2 || Condicao3) {
            Pontuacao = 6;
        } else {
            Pontuacao = 5;
        }

        System.out.println("Pontuação do aço: " + Pontuacao);

        scanner.close();
    }
}