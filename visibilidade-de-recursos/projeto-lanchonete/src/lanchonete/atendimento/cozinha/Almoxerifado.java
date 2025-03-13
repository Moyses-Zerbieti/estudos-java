package lanchonete.atendimento.cozinha;

public class Almoxerifado {
    private void contolarEntradaNoEstoque(){
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    private void controlarSaidaNoEstoque(){
        System.out.println("CONTROLANDO SAÍDA DOS ITENS");
    }
    void entregarIngrediente(){
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaidaNoEstoque();
    }
    void listaDeRetiradas(){
        contolarEntradaNoEstoque();
    }
    void trocarGás(){
        System.out.println("TROCANDO O GÁS");
    }
}