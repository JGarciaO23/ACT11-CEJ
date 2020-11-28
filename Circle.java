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
public class Circle implements Shape{
Double radio, area, perimetro;
   public Circle(){}
    
   @Override
    public void getArea() {
        Scanner ca = new Scanner(System.in);
        System.out.println("Agrega el radio que corresponde al círculo: ");
        radio = ca.nextDouble();
        area = 3.14159*(radio*radio);
        System.out.println("El área de la figura es: " + area);
    }

    @Override
    public void getPerimeter() {
        Scanner cp = new Scanner(System.in);
        System.out.println("Agrega el radio que corresponde al círculo: ");
        radio = cp.nextDouble();
        perimetro = 2*Math.PI*radio;
                
        System.out.println("El perimetro de la figura es: " + perimetro);
         
    }
    
}