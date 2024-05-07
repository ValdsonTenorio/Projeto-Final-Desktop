/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistence;

import br.unigran.entities.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author laboratorio
 */
public class Dados {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.unigran_Sistema_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();

    public void salvar(Object o){
        etx.begin();
        em.persist(o);
        etx.commit();
    }
    public void atualiza(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();     
    }    
    public void remove(Object o){
        etx.begin();
        em.remove(o);
        etx.commit(); 
    }
    public List listar(){
        return em.createNativeQuery("select * from funcionario f",Funcionario.class).getResultList();
    }
    public List listaOO(){
        return em.createNativeQuery("select * from funcionario f").getResultList();
    }
}
