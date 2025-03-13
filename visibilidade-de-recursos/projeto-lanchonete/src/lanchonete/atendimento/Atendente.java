package lanchonete.atendimento;

public class Atendente {
    private void pegarLancheNaCozinha(){
        System.out.println("PEGANDO LANCHE NA COZINHA");
    }
    public void servindoMesa(){
        System.out.println("SERVINDO AS MESAS");
        pegarLancheNaCozinha();
    }
    public void receberPagamento(){
        System.out.println("RECEBENDO PAGAMENTO");
    }
    void trocarGás(){
        System.out.println("TROCANDO O GÁS");
    }
}
