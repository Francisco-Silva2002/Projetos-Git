/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Iterator;
import model.Atleta;

/**
 *
 * @author franc
 */
public class ControlaAtleta {
    private ArrayList atletas;
    
    public ControlaAtleta()
    {
        atletas = new ArrayList();
    }
    
    public Atleta adicionaAtleta(String nome, float peso, float altura, int idade) throws NumeroInvalidoException
    {
        Atleta at1 = new Atleta();
        at1.setNome(nome);
        at1.setPeso(peso);
        at1.setAltura(altura);
        at1.setIdade(idade);
        
        if(at1.getAltura() <= 0 || at1.getPeso() <= 0 || at1.getIdade() <= 0)
        {
            throw new NumeroInvalidoException("Número não pode ser negativo ou nulo!");
        }
        
        
        
        atletas.add(at1);
        
        return at1;
    }
    
    public float pesoMedio()
    {
        int pesoM = 0;
        int n = 0;
        
        Iterator it = atletas.iterator();
        while(it.hasNext())
        {
            Atleta at1 = (Atleta) it.next();
            if(at1.getPeso() != 0)
            {
                pesoM += at1.getPeso();
                n++;
            }
        }
        
        return (pesoM/n);
    }
    
    public ArrayList maisAlto()
    {
        ArrayList<Atleta> m = new ArrayList();
        float mA = 0;
        
        Iterator it = atletas.iterator();
        
        while(it.hasNext())
        {
            Atleta at1 = (Atleta) it.next();
            
            if(at1.getAltura() >= mA)
            {
                if(mA < at1.getAltura())
                {
                    m = new ArrayList();
                }
                mA = at1.getAltura();
                m.add(at1);
            }
        }        
        return m;
    }
    
    public ArrayList maisVelho()
    {
        ArrayList<Atleta> m = new ArrayList();
        int mV = 0;
        
        Iterator it = atletas.iterator();
        while(it.hasNext())
        {
            Atleta at1 = (Atleta) it.next();
            
            if(at1.getIdade() >= mV)
            {
                if(mV < at1.getIdade())
                {
                    m = new ArrayList();
                }
                mV = at1.getIdade();
                m.add(at1);
            }
        }
        
        return m;
    }
    
    public String escreveAtletas()
    {
        String s = ""; 
        
        Iterator it = atletas.iterator();
        while(it.hasNext())
        {
            Atleta at1 = (Atleta) it.next();
            
            s += ("► Nome: " + at1.getNome() + "        Idade: " + at1.getIdade() + "       Peso: " + at1.getPeso() + "     Altura: " + at1.getAltura() + "\n");
        }
        return s;
    }
}
