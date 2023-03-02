package BackEndCoding.JavaCoding.Codes.Desafio;

public class ClienteTeste {
    public static void main(String[] args) {
//adicionando valores a lista de compras
    Compra c1 = new Compra();
    c1.adicionaItens("caixa de som", 2500.60, 1);
    c1.adicionaItem(new Produto("televisao",12600.30),1);

    Compra c2 =new Compra();
    c2.adicionaItens("oculos de sol", 550, 2);
    c2.adicionaItem(new Produto("cerveja", 3.50), 40);
    c2.adicionaItens("chinelo", 50, 2);

//adiciona o nome do cliente
    Cliente cl1 = new Cliente("Alberto da Silva");
//colocando listas de compras para este cliente
    cl1.listaDeCompras.add(c1);
    cl1.listaDeCompras.add(c2);

    System.out.println(cl1.getValorTotal());



    }
}