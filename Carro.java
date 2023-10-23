public class Carro extends Veiculo{
    public String nome;
    public int rodas;
    public String cor;

    public Carro(String nome, int rodas, String cor)
    {
        this.nome = nome;
        this.rodas = rodas;
        this.cor = cor;
    }
    @Override
    public void Transportar() {
        System.out.println("Você está transportando");
    }
    @Override
    public void Consumir() {
        System.out.println("Você está consumindo");
    }
}
