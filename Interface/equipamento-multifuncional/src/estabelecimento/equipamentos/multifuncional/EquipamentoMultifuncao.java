package estabelecimento.equipamentos.multifuncional;

import estabelecimento.equipamentos.copiadora.Copiadora;
import estabelecimento.equipamentos.digitalizadora.Digitalizadora;
import estabelecimento.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncao implements Copiadora, Digitalizadora, Impressora{

    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar() {
       System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void copiar(){
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");   
    }
}
