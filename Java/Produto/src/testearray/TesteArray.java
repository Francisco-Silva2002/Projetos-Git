/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testearray;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author franc
 */
public class TesteArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Revista r1 = new Revista();
        
        ArrayList <Produto> lista = new ArrayList();
        lista.add(l1);
        lista.add(l2);
        lista.add(r1);
        
        Iterator <Produto> cat = lista.iterator();
        
        while(cat.hasNext())
        {
            Produto c = cat.next();
            //c.mostradados();
            if(c instanceof Revista)
            {
                System.out.println("=========");
                c.mostradados();
            }
        }
    }
}
