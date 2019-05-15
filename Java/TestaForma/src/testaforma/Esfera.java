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
public class Esfera extends FormaTridimensional{
    
     @Override
    public float getArea()
    {
        return super.getArea();
    }
    
    @Override
    public float getVolume()
    {
        return super.getVolume();
    }
    
    @Override
    public float obterArea(float med)
    {
        super.setArea((float) (4*3.14*med*med));
        return super.getArea();
    }
    
    @Override
    public float obterVolume(float med)
    {
        super.setVolume((float) (4/3*med*med*med*3.14));
        return super.getVolume();
    }
}
