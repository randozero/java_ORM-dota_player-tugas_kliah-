/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import javax.persistence.EntityManager;
import model.player;

/**
 *
 * @author randozero
 */
public class Player_DAO {
    
    EntityManager em;

    public Player_DAO() {
        em = koneksi.getEntityManager();
    }
    
     public void insert(player ply){
        try{
            em.getTransaction().begin();
            em.persist(ply);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void update (player ply){
        try{
            em.getTransaction().begin();
            em.merge(ply);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<player> select (){
        return em.createQuery("SELECT ply FROM player ply").getResultList();
    }
    
    
    
}
