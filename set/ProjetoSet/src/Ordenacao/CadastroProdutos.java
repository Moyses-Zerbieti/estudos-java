package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set <Produto> listProdutos;

    public CadastroProdutos() {
        this.listProdutos = new HashSet<>();
    }

    public void cadastrarProdutor(String nome, int codigo, double preco, int quantidade){
        listProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set <Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(listProdutos);
        return produtosPorNome;
    }

    public Set <Produto> exibirPorPreco(){
        Set <Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(listProdutos);
        return produtosPorPreco;
    }

    public void exibirProdutos(){
    System.out.println(listProdutos);
    
    }

    public int contarProdutoCadastrados(){
        return listProdutos.size();
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.cadastrarProdutor("Produto 3", 11, 23.5 , 4);
        cadastroProdutos.cadastrarProdutor("Produto 1", 13, 33.7 , 3);
        cadastroProdutos.cadastrarProdutor("Produto 6", 15, 89.6 , 7);
        cadastroProdutos.cadastrarProdutor("Produto 2", 18, 99.2 , 9);

        //cadastroProdutos.exibirProdutos();
        //System.out.println(cadastroProdutos.exibirProdutosPorNome());

        //System.out.println(cadastroProdutos.exibirPorPreco());

        System.out.println("Temos: " + cadastroProdutos.contarProdutoCadastrados() + " produtos cadastrados no sistema");


    }
}
