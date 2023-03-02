package BackEndCoding.JavaCoding.Codes.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Compra> listaDeCompras = new ArrayList<Compra>();
    String nomeCliente;
    Cliente(String nomeCliente){ this.nomeCliente = nomeCliente; }

    void adicionarCompra(Compra compra){
        this.listaDeCompras.add(compra);
    }
    double getValorTotal(){
        double total = 0;

        for(Compra compras : listaDeCompras){
           total += compras.calculaTotal();
        }

        return total;
    }

}