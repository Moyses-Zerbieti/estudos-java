package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set <Contato> listaContato;

    public AgendaContatos() {
    this.listaContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){
        listaContato.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos(){
        System.out.println(listaContato);
    }

    public int contarContatos(){
        return listaContato.size();
    }

    public Set <Contato> pesquisaPorNome(String nome){
        Set <Contato> contatosPorNome = new HashSet<>();
        for (Contato c : listaContato){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumerContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : listaContato){
            if (c.getNome().trim().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado; 
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rafael",112);
        agendaContatos.adicionarContato("Rafael",114);// esse contato não foi adicionado por ter mesmo nome que o antrerior
        agendaContatos.adicionarContato("Rafael Trampo",1213);
        agendaContatos.adicionarContato("Rafael Galpão",1198);
        agendaContatos.adicionarContato("Rafael MotoPeça",1314);
        agendaContatos.adicionarContato("Alexandre ",1213);//esse contato pode ser adicionado por ter o nome diferente mesmo com o numero igual

        agendaContatos.exibirContatos();

        System.out.println (agendaContatos.pesquisaPorNome("Rafael MotoPeça"));
        System.out.println("Contato atualizado " + agendaContatos.atualizarNumerContato("Alexandre", 1514));

        System.out.println("Temos: " + agendaContatos.contarContatos() + " contatos na agenda");

        
    
    } 
}
