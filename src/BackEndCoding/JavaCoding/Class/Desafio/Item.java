package BackEndCoding.JavaCoding.Class.Desafio;

public class Item {
    Produto prod;
    int quantidade;
//contrutor do 'item' para armazenar e receber todos os valores de suas variaveis como parâmetro

//colocando o produto como variavel para receber parametro ela retorna todoas as variaveis do construtor do produto
    Item(Produto prod, int quantidade){
        this.quantidade = quantidade;
        this.prod = prod;
    }
}
