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
public class Circunferencia extends AreaCalculavel{
    private double raio;
    
    public Circunferencia(double raio) throws IllegalArgumentException
    {
        if(raio <= 0)
        {
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }
        else
        {
            this.raio = raio;
        }
    }
    
    
    @Override
    public void calcularArea()
    {
        System.out.printf("Área da circunferência %.2f\n", 3.14*raio*raio);
    }
    
}
