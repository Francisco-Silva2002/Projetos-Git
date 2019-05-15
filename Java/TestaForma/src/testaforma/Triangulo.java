/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaforma;

/**
 *
 * @author franc
 */
public class Triangulo extends FormaBidimensional{
 
    @Override
    public float getArea()
    {
        return super.getArea();
    }
    
    @Override
    public float obterArea(float med)
    {
        super.setArea((float) (med*med*1.7/4));
        return super.getArea();
    }
    
}
