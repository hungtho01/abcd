/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Tho
 */
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import model.WorkCalculator;
public class Controller {
    public static <T> List<T> readFromFile(String filename) throws IOException, ClassNotFoundException{
        File f = new File(filename);
        List<T> res = new ArrayList<T>();
        if (f.length() > 0){
            f.createNewFile();
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            res = (List<T>) ois.readObject();
            ois.close();
            fis.close();
        }
        return res;
    }
    public static <T> void writeToFile(String filename,List<T> l) throws IOException{
        File f = new File(filename);
        
        
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(l);
        oos.close();
        fos.close();
        
    }
    public static List<WorkCalculator> sortByWorkerName(List<WorkCalculator> l){
        return l.stream().sorted(Comparator.comparing(WorkCalculator::getWorkerName)).collect(Collectors.toList());
    }
    public static List<WorkCalculator> sortByFactoryName(List<WorkCalculator> l){
        return l.stream().sorted(Comparator.comparing(WorkCalculator::getFactoryName)).collect(Collectors.toList());
    }
}
