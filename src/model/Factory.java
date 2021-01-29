/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tho
 */
public class Factory implements java.io.Serializable{
    private int id,k;
    private String name,des;

    public Factory(int id, int k, String name, String des) {
        this.id = id;
        this.k = k;
        this.name = name;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public int getK() {
        return k;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }
    
}
