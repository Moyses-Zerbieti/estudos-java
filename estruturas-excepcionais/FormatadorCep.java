public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = fomatarCep("2345676");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            System.out.println("O cep não corresponde com as regras de escrita");
        }
    }
    static String fomatarCep(String cep) throws CepInvalido{
        if (cep.length() != 8)
        throw new CepInvalido();

        return "23.765-084";
    }
}
