public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Fusca", 4, "Preto");

        carro.Transportar();
        carro.Consumir();

        System.out.println("Meu carro é um " +carro.nome+ " " +carro.cor + " e como todo carro, tem " +carro.rodas+ "rodas");
    }
}
