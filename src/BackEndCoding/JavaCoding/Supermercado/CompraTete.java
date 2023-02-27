package BackEndCoding.JavaCoding.Supermercado;

public class CompraTete {
    public static void main(String[] args) {

        Compra compras = new Compra();
        compras.cliente = "pedro";
        compras.adicionarItem(new Item("lapiseira",5,3));
        compras.adicionarItem((new Item ("borachaa",2,0.99)));
        compras.adicionarItem((new Item ("bisteca",4,79)));

        System.out.println(compras.getTotalValue());

        double total = compras.itens.get(0).compra.itens.get(1).compra.itens.get(2).compra.getTotalValue();
        System.out.println("O total é: "+total);


    }
}
