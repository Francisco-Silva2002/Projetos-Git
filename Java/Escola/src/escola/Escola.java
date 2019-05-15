/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.ArrayList;
/**
 *
 * @author franc
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList escola = new ArrayList();
        
        Aluno a = new Aluno("Francisco", 1234);
        Aluno b = new Aluno("Robson", 5678);
        Aluno c = new Aluno("Carlos", 1222);
        Aluno d = new Aluno("Caio", 0000);
        
        Professor e = new Professor("Sabrina", 2222, 1500f);
        Professor f = new Professor("Douglas", 3333, 2500f);
        Professor g = new Professor("Sabrina Santos", 5555, 5000f);
        Professor h = new Professor("Sabrina R.", 2222, 1500f);
        Professor i = new Professor("Sabrina A.", 2222, 1500f);
    }
    
}
