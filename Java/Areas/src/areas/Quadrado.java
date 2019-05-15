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
public class Quadrado extends AreaCalculavel{
    private double lado;
    
    
    public Quadrado(double lado) throws IllegalArgumentException
    {
        if(lado <= 0)
        {
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }
        else
        {
            this.lado = lado;
        }
    }
    
    
    @Override
    public void calcularArea()
    {
        System.out.printf("A área do quadrado é %.2f\n", lado*lado);
    }
    
}
