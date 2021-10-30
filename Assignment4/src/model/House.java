/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author gyt
 */
public class House extends Community{
    private int Houseid;
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House() {
    }
    
    

    public int getHouseid() {
        return Houseid;
    }

    public void setHouseid(int Houseid) {
        this.Houseid = Houseid;
    }
    

    
    
}
