/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaforma;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author franc
 */
public class TestaForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList();
        
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        c.obterArea(4);
        q.obterArea(5);
        t.obterArea(5);
        
        Cubo cubo = new Cubo();
        Tetraedro tetra = new Tetraedro();
        Esfera e = new Esfera();
        cubo.obterArea(6);
        tetra.obterArea(6);
        e.obterArea(6);
        cubo.obterVolume(5);
        tetra.obterVolume(5);
        e.obterVolume(5);
        
        
        formas.add(c);
        formas.add(q);
        formas.add(t);
        formas.add(cubo);
        formas.add(tetra);
        formas.add(e);
        
        Iterator <Forma> form = formas.iterator();
        
        while(form.hasNext())
        {
            Forma k = form.next();
            if(k instanceof FormaBidimensional)
            {
                System.out.println("Forma Bidimensionais");
                System.out.println("Área: " + k.getArea() + "\n");
            }
            else
            {
                System.out.println("Forma Tridimensional");
                System.out.println("Área: " + k.getArea());
                System.out.println("Volume: " + k.getVolume() + "\n");
            }
        }
    }
}
