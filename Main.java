import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JGarciaO.23
 */
public class Main {
    public static void main (String args []){
      String ecuaacion, figura;

      Circle c = new Circle();
      Square s = new Square();
      Triangle t = new Triangle();
      
      System.out.println("¿Calcular área o perímetro?");
            System.out.println("a = Area");
                  System.out.println("p = Perimetro");
      Scanner sc = new Scanner(System.in);
      ecuaacion = sc.nextLine();
      if ("a".equals(ecuaacion))
      {
                System.out.println("Seleccione una de las siguientes figuras: ");
                                System.out.println("x = Cuadrado");
                                System.out.println("y = Circulo");
                                System.out.println("z = Triangulo");
                                
                Scanner fig = new Scanner (System.in);
                figura = fig.nextLine();
                if (null !=figura)
                switch (figura){
                    case"x":
                        s.getArea();
                        break;
                    case"y":
                        c.getArea();
                        break;
                    case"z":
                        t.getArea();
                        break;
                }
                    
      }
      else if ("p".equals(ecuaacion))
      {
          System.out.println("Seleccione una de las siguientes figuras: ");
                                System.out.println("h = Cuadrado");
                                System.out.println("i = Circulo");
                                System.out.println("j = Triangulo");
                Scanner fig2 = new Scanner (System.in);
                figura = fig2.nextLine();
                if (null != figura)
                switch (figura) {
              case "h":
                  s.getPerimeter();
                  break;
              case "i":
                  c.getPerimeter();
                  break;
              case "j":
                  t.getPerimeter();
                  break;
              default:
                  break;

                }
      }
          
      
      
      

    }  
}