import java.time.Year;

public class Funcionario {
    protected String nome;
    protected int nasc;
    protected double salario;

    public Funcionario(String nome, int nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("Salário: " + this.salario);
    }

    public int calcularIdade() {
        int anoAtual = Year.now().getValue();
        return anoAtual - this.nasc;
    }
}
