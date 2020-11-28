import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JGarciaO.23
 */
public class Triangle implements Shape{
double area, base, altura, perimetro, aa, bb, cc;
   public Triangle(){}
   
    @Override
    public void getArea() {
        Scanner tb = new Scanner(System.in);
        Scanner th = new Scanner(System.in);
        System.out.println("Agrega la base correspondiente al triángulo: ");
        base = tb.nextDouble();
        System.out.println("Agrega la altura del triángulo: ");
        altura = th.nextDouble();
        area = (base*altura)/2;
       System.out.println("El area que corresponde al triángulo es: "+area);
    }

   @Override
    public void getPerimeter() {
         Scanner a = new Scanner(System.in);
                  Scanner b = new Scanner(System.in);
                           Scanner c = new Scanner(System.in);
         System.out.println("Agrega la medida de uno de los lados del triángulo: ");
         aa = a.nextDouble();
         System.out.println("Agrega la medida del segundo lado del triángulo: ");
         bb = b.nextDouble();
         System.out.println("Agrega la medida del tercer lado del triángulo: ");
         cc = b.nextDouble();
         perimetro = aa+bb+cc;
         System.out.println("El perimetro que corresponde al triángulo es: "+perimetro);
    }
    
}
