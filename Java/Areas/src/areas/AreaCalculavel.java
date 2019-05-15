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
public abstract class AreaCalculavel {
    private String cor;
    
    
    public void calcularArea()
    {
        
    }
    
    public void colorirArea(String c)
    {
        cor = c;
        System.out.println("A cor é " + cor);
    }
    
}
