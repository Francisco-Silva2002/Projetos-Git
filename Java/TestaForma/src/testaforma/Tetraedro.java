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
public class Tetraedro extends FormaTridimensional{
    
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
        super.setArea((float) (med*med*1.7));
        return super.getArea();
    }
    
    @Override
    public float obterVolume(float med)
    {
        super.setVolume((float) (med*med*med*1.4/12));
        return super.getVolume();
    }
}
