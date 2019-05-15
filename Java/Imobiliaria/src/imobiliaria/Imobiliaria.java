/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;


import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author franc
 */
public class Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Imovel> lista = new ArrayList();
        Novo a1 = new Novo("Rua Nova", 1000.00f, 500.00f);
        Novo a2 = new Novo("Rua Nova", 2000.00f, 1000.00f);
        Novo a3 = new Novo("Rua Nova", 3000.00f, 1500.00f);
        Novo a4 = new Novo("Rua Nova", 4000.00f, 2000.00f);
        
        Velho b1 = new Velho("Rua Velha", 1000.00f,2000.00f);
        Velho b2 = new Velho("Rua Velha", 2000.00f,1500.00f);
        Velho b3 = new Velho("Rua Velha", 3000.00f,1000.00f);
        
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(b1);
        lista.add(b2);
        lista.add(b3);
        
        Iterator <Imovel> c = lista.iterator();
        
        while(c.hasNext())
        {
            Imovel a = c.next();
            
            if(a instanceof Novo)
            {
                a.imprimeDados();
               System.out.println("\n");
            }
        }
    }
    
}
