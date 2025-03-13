public class SistemaIbge {
    public static void main(String[] args) throws Exception {
        for (EstadadosBrasileiros e: EstadadosBrasileiros.values()){
           //System.out.println(e.getSigla() + "- " + e.getNome());
        }
        EstadadosBrasileiros eb = EstadadosBrasileiros.RIO_JANEIRO;
        System.out.println(eb.getSigla() + "-" + eb.getNomeMaiusculo() + "-" + eb.getCodigo()) ;
    }
}
