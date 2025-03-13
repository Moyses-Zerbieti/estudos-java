public enum EstadadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo",11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro",21),
    ESPIRIO_SANTO ("ES", "Espirito Santo", 27),
    BAHIA ("BA", "Bahia",71)
    ;
    
    private String sigla;
    private String nome;
    private int codigo;

    private EstadadosBrasileiros (String sigla, String nome, int codigo){
        this.sigla = sigla;
        this.nome = nome;
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
    
}
