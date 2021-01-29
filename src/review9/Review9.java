/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review9;
import java.util.*;
import java.io.*;

/**
 *
 * @author Tho
 */
public class Review9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);l.add(2);l.add(3);
        Collections.reverse(l);
        for (Integer i : l){
            System.out.println(i);
        }
    }
    
}
