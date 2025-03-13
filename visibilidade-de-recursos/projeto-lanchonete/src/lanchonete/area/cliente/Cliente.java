package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("ESCOLHENDO O LANCHE");
    }
    public void fazerPedido(){
        System.out.println("FAZENDO O PEDIDO");
    }
     private void consultarSaldoNoAplicativo(){
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
    public void pagarConta(){
        consultarSaldoNoAplicativo();
        System.out.println("PAGANDO A CONTA");
    }
}
