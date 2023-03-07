package BackEndCoding.JavaCoding.Class.Desafio;

import java.util.ArrayList;

public class Compra {
    Cliente cliente;
    ArrayList<Item> itens = new ArrayList<Item>();
//A classe 'compra' recebe varios itens como uma lista e adiciona eles para serem armazenados nesta lista
    void adicionaItem(Produto p, int quantidade) {
        itens.add(new Item(p,quantidade));
    }

    void adicionaItens(String nome, double preco, int quantidade) {
        itens.add(new Item(new Produto(nome,preco), quantidade));
    }

    double calculaTotal(){
        double total = 0;

        for(Item item :itens){
            total += item.quantidade * item.prod.preco;
        }

        return total;
    }
}