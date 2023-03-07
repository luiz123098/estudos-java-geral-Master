package BackEndCoding.JavaCoding.Class.Whiles.Switch;
import  java.util.Scanner;
public class SwhitchIntro {
    public static void main(String[] args) {
    Scanner  ler = new Scanner(System.in);
            System.out.println("Enter a  number: ");
            int i = ler.nextInt();
                    switch (i) {
                        case 1:
                            System.out.println("The value  is = 1");
                            break;
                        case 2:
                            System.out.println("The value  is = 2");
                            break;
                        case 3:
                            System.out.println("The value  is = 3");
                            break;
                        case 4:
                            System.out.println("The value  is = 4");
                            break;
                        case 5:
                            System.out.println("The value  is = 5");
                            break;
                        case 6:
                            System.out.println("The value  is = 6");
                            break;
                        case 7:
                            System.out.println("The value  is = 7");
                            break;
                        case 8:
                            System.out.println("The value  is = 8");
                            break;
                        case 9:
                            System.out.println("The value  is = 9");
                            break;
                        case 10:
                            System.out.println("The value  is = 10");
                            break;

                        default:
                            System.out.println("!!!!Enter a valid number between 0 and 10!!!!!");
                    }
            }
    }