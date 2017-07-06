/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dota_player;

import controller.Player_DAO;
import java.util.List;
import model.player;

/**
 *
 * @author randozero
 */
public class Dota_player {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        player ply=new player();
//        ply.setId(new Long("1"));
//        ply.setPlayer_ID("Liow");
//        ply.setLevel_Id(131);
//        ply.setExp(0.55);
//        new Player_DAO().update(ply);
        
        List<player> dataply=new Player_DAO().select();
        
        for(player ply:dataply){
            System.out.println(ply.getPlayer_ID()+" "+ply.getExp()+"% "+ply.getLevel_Id());
        }
        
    }
    
}
