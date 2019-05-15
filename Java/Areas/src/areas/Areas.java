/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author franc
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Quadrado q = new Quadrado(5);
        Retangulo r = new Retangulo(2,6);
        Circunferencia c = new Circunferencia(5);
        
        try
        {
            q.calcularArea();
            r.calcularArea();
            c.calcularArea();
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Algum valor foi digitado errado. Devem ser maiores que 0");
        }
    }
    
}
