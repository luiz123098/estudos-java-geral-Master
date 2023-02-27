package BackEndCoding.JavaCoding.GetSet.ProdutosClasses;
public class Produto {
        String nome;
        double  preco;
        double descontof;
        static double desconto = 0.25;
        Produto(String nomeInicial){nomeInicial = nome ;}
        double precoComDesconto(){ return  preco * (1 -desconto);}
        double precoComDescontoGerente(double descontoGerente){ return preco *  (1- desconto  +  descontoGerente);}
        public double precoComDescontoNoFeriado (double descontoGerente){ return preco * (1-  descontof +  descontoGerente);}
        public String feriadoDesconto(){
                return nome+
                       " Neste feriado nosso desconto pode ter algumas alterações os descontos são de: "
                       +desconto+
                       " entao seu total ira ficar:";
        }
}