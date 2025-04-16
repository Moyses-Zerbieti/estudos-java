public class Vendedor extends Funcionario {
    private double comissao;
    private double vendaMes;

    public Vendedor (
        String nome,
        String endereco,
        int idade,
        String codigo,
        double salario,
        double comissao,
        double vendaMes){
        super(nome, endereco, idade, codigo, salario);
        this.comissao = comissao;
        this.vendaMes = vendaMes;
    }
    @Override
    public String getCodigo(){
        return "VD:" + this.codigo;

    }
    public Vendedor (){   
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getVendaMes() {
        return vendaMes;
    }
    public void setVendaMes(double vendaMes) {
        this.vendaMes = vendaMes;
    }
}
