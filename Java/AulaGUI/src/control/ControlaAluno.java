/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Iterator;
import model.Aluno;

/**
 *
 * @author franc
 */
public class ControlaAluno {
    
    //arrayList - atributo
    private ArrayList lista;
    
    //contrutor
    public ControlaAluno()
    {
        lista = new ArrayList();
    }
    
    //metodo
    public Aluno adicionaNaLista(String nome, int idade)
    {
        //criando um objeto aluno com informações da tela de cadastro
        Aluno al1 = new Aluno();
        al1.setNome(nome);
        al1.setIdade(idade);
        
        //adicionando o aluno na lista
        lista.add(al1);
        return al1;
    }
    
    public int somaIdade()
    {
        int soma = 0;
        Iterator it = lista.iterator();
        while(it.hasNext())
        {
            Aluno al = (Aluno) it.next();
            soma += al.getIdade();
        }
        return soma;
    }
}
