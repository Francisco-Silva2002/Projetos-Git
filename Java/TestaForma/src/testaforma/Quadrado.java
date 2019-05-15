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
public class Quadrado extends FormaBidimensional{
    
    @Override
    public float getArea()
    {
        return super.getArea();
    }
    
    @Override
    public float obterArea(float med)
    {
        super.setArea(med*med);
        return super.getArea();
    }
}
