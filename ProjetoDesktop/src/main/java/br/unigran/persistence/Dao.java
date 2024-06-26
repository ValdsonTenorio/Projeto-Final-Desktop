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
public class Dao {
    private static Dao entidade;
    private final EntityManagerFactory  emf;
    private final  EntityManager  em;

    private Dao() {
        emf= Persistence.createEntityManagerFactory("br.unigran_ProjetoDesktop_jar_1.0-SNAPSHOTPU");
        em= emf.createEntityManager();

    }

    public static Dao getInstace(){
        if(entidade==null)
            entidade= new Dao();
        return entidade;
    }
    public EntityManager getEm(){
        return em;
    }

    public Object salvar(Object o){
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }
    public  Object atualiza(Object o){
        em.getTransaction().begin();
        Object retorno = em.merge(o);
        em.getTransaction().commit();
        return retorno;
    }
    public  void remove(Object o){
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }
    public  List listar(Class c, String where){
        return em.createNativeQuery("select o from "+c.getSimpleName()+" o where 1=1 "+where)
                .getResultList();
    }

    void remove(Integer id, Class clazz) {
        em.getTransaction().begin();
        em.remove(id);
        em.getTransaction().commit();    }
}