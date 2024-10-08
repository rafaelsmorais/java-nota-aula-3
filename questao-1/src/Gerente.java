public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, int nasc, double salario) {
        super(nome, nasc, salario);
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("Projeto atual: " + this.projeto);
    }
}
