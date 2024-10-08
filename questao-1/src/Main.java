import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNextLine = new Scanner(System.in);
        System.out.println("Deseja cadastrar:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Programador");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("Digite o nome:");
            String nome = scNextLine.nextLine();
            System.out.println("Digite o ano de nascimento: ");
            int nasc = sc.nextInt();
            System.out.println("Digite o salário do Gerente: ");
            double salario = sc.nextDouble();
            Gerente g = new Gerente(nome, nasc, salario);
            System.out.println("Informe o projeto do gerente: ");
            String proj = scNextLine.nextLine();
            g.setProjeto(proj);
            System.out.println("Dados do Gerente:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + g.calcularIdade());
            g.informarProjeto();
            g.informarSalario();
        } else if (escolha == 2) {
            System.out.println("Digite o nome:");
            String nome = scNextLine.nextLine();
            System.out.println("Digite o ano de nascimento: ");
            int nasc = sc.nextInt();
            System.out.println("Digite o salário do Programador: ");
            double salario = sc.nextDouble();
            Programador p = new Programador(nome, nasc, salario);
            System.out.println("Informe a linguagem do programador: ");
            String ling = scNextLine.nextLine();
            p.setLinguagem(ling);
            System.out.println("Dados do Programador:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + p.calcularIdade());
            p.informarLinguagem();
            p.informarSalario();
        }
    }
}