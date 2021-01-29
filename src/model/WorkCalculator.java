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
public class WorkCalculator implements java.io.Serializable{
    private Factory factory;
    private Worker worker;
    private int days;

    public void setDays(int days) {
        this.days = days;
    }

    public Factory getFactory() {
        return factory;
    }

    public Worker getWorker() {
        return worker;
    }

    public int getDays() {
        return days;
    }

    public WorkCalculator(Factory factory, Worker worker, int days) {
        this.factory = factory;
        this.worker = worker;
        this.days = days;
    }
    public String getWorkerName(){
        return getWorker().getName();
    }
    public String getFactoryName(){
        return getFactory().getName();
    }
}
