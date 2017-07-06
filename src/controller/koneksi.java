/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author randozero
 */
public class koneksi {
    
    private static EntityManagerFactory ent;
    
    public static EntityManager getEntityManager(){
        EntityManager em=null;
        
        try {
            ent = Persistence.createEntityManagerFactory("Dota_playerPU");
            em = ent.createEntityManager();
        } catch (Exception e) {
            System.out.println("gagal");
        }
        
        return em;
        
    }
    
}
