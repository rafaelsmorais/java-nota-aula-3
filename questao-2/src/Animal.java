public class Animal {
    protected String nome;
    protected String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void caminha() {
        System.out.println("quatro patas");
    }
}
