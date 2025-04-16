package estabelecimento;

import estabelecimento.equipamentos.copiadora.Copiadora;
import estabelecimento.equipamentos.digitalizadora.Digitalizadora;
import estabelecimento.equipamentos.impressora.DeskJet;
import estabelecimento.equipamentos.impressora.Impressora;
import estabelecimento.equipamentos.impressora.LaserJet;
import estabelecimento.equipamentos.multifuncional.EquipamentoMultifuncao;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncao em = new EquipamentoMultifuncao();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
