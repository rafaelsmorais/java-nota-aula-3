public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, int nasc, double salario) {
        super(nome, nasc, salario);
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("Linguagem: " + this.linguagem);
    }
}
