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
public class Worker implements java.io.Serializable{
    private int id,level;
    private String name,address,phone;

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Worker(int id, int level, String name, String address, String phone) {
        this.id = id;
        this.level = level;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
