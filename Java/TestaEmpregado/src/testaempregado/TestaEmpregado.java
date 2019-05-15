/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaempregado;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author franc
 */
public class TestaEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList();
        
        Assalariado a1 = new Assalariado();
        Assalariado a2 = new Assalariado();
        
        Comissionado c1 = new Comissionado(2000f, 0.20);
        Comissionado c2 = new Comissionado(3000f, 0.50);
        
        Horista h1 = new Horista(100f, 4);
        Horista h2 = new Horista(500f, 10);
        
        empregados.add(a1);
        empregados.add(a2);
        empregados.add(c1);
        empregados.add(c2);
        empregados.add(h1);
        empregados.add(h2);
        
        Iterator<Empregado> it = empregados.iterator();
        
        while(it.hasNext())
        {
            System.out.printf("Salário: R$%.2f", it);
        }
    }
    
}
