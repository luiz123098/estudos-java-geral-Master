package BackEndCoding.JavaCoding.Codes.Collections;

import java.util.*;

public class Aprovacao_Reprovacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name, keepInLoop = "";
        double grade1, grade2;

        if(!keepInLoop.equals("sair")) {
            Set<String> approved = new TreeSet<>();

            System.out.println("Nome: ");
            approved.add(name = s.nextLine());

            System.out.println("Nota 1: ");
            grade1 = s.nextDouble();
            String gradeString;
            gradeString = Double.toString(grade1);
            approved.add(gradeString);

            System.out.println("Nota 2: ");
            grade2 = s.nextDouble();
            String grade2String;
            grade2String = Double.toString(grade2);
            approved.add(grade2String);

            System.out.println("Tem outro aluno? ou deseja sair?");
            keepInLoop = s.next();
        }


        //double media;
        //media = grade1 + grade2/2;
       // for (double medias:
       //      ) {
//
       // }
    }
}