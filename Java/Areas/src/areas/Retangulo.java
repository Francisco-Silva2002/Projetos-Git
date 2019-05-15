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
public class Retangulo extends AreaCalculavel{
    private double lado1;
    private double lado2;
    
    public Retangulo(double l1, double l2) throws IllegalArgumentException
    {
        if(l1<=0 || l2<=0)
        {
            throw new IllegalArgumentException("Valor inválido, os valores esperados são maiores que 0 (zero)");
        }
        else if(l1 == l2)
        {
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes");
        }
        else
        {
            lado1 = l1;
            lado2 = l2;
        }
    }
    
    
    @Override
    public void calcularArea()
    {
        System.out.printf("Área do Retângulo %.2f\n", lado1*lado2);
    }
    
}
