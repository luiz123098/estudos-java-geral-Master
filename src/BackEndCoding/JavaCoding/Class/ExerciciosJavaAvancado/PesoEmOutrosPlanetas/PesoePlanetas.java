package BackEndCoding.JavaCoding.Class.ExerciciosJavaAvancado.PesoEmOutrosPlanetas;

public class PesoePlanetas {

    public double pesoTerra;
    public double pesoPlaneta;
    public double gravidadePlaneta;
    public String planeta;
    public double pesoEmPlaneta(double pesoTerra, String planeta){
        this.pesoTerra = pesoTerra;
        this.planeta = planeta;
            if(planeta.equals("mercurio")){
                gravidadePlaneta = 2.37;
            }
            if(planeta.equals("venus")){
                gravidadePlaneta = 0.88;
            }
            if(planeta.equals("marte")){
                gravidadePlaneta = 0.38;
            }
            if(planeta.equals("jupiter")){
                gravidadePlaneta = 2.64;
            }
            if(planeta.equals("saturno")){
                gravidadePlaneta = 1.15;
            }
            if(planeta.equals("urano")){
                gravidadePlaneta = 1.17;
            }
        return this.pesoPlaneta = (pesoTerra / 10) * gravidadePlaneta;
    }

}
