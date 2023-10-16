public class Funcionario {

    public int id = 0;
    public String nome = "";
    public boolean cracha = true;

    public void baterPonto(int id){
        MaquinaDePonto p = new MaquinaDePonto() {

            p.executarRegistro(id);
        };
    }
}
