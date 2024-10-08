import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNextLine = new Scanner(System.in);
        System.out.println("Digite 1 para Gato ou 2 para Cachorro");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("Digite o nome do gato:");
            String nome = scNextLine.nextLine();
            System.out.println("Digite a raça do gato:");
            String raca = scNextLine.nextLine();
            Gato g = new Gato(nome, raca);
            g.caminha();
            g.mia();
        } else if (escolha == 2) {
            System.out.println("Digite o nome do cachorro:");
            String nome = scNextLine.nextLine();
            System.out.println("Digite a raça do cachorro:");
            String raca = scNextLine.nextLine();
            Cachorro c = new Cachorro(nome, raca);
            c.caminha();
            c.late();
        }
    }
}