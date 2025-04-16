package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set <Convidado> listConvidados;

    public ConjuntoConvidados(){
        this.listConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        listConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c : listConvidados){
            if(c.getCodigoConvite()== codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        listConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return listConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(listConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 123);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 127);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 122);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 125);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 122);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 128);

       conjuntoConvidados.removerConvidado(128);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
