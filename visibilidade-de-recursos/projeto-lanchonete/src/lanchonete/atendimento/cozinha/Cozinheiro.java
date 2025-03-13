package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    void pedirIngredientes(Almoxerifado almoxerifado){
        almoxerifado.entregarIngrediente();
    }
    void listaDeRetiradasDoEstoque(Almoxerifado almoxerifado){
        almoxerifado.listaDeRetiradas();
    }
    void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    void baterVitamina(){
        System.out.println("BATENDO VITAMINA");
    }
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    void pedirParaTrocarGas(Almoxerifado meuAmigo){
        meuAmigo.trocarGás();
    }
}
