package com.company;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // inicijalno kreiramo vektor capacity(size) 2*/
        Vector<String> vec = new Vector<String>(2);

        // dodajemo elemente u vector
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        // proveravamo velicinu i kapacitet - capacityIncrement
        System.out.println("Size is: "+ vec.size());
        System.out.println("Default capacity increment is: "+ vec.capacity());

        vec.addElement("fruit1");
        vec.addElement("fruit2");
        vec.addElement("fruit3");

        // velicina i kapacitet nakon novog unosa
        System.out.println("Size after addition " + vec.size());
        System.out.println("Capacity after increment: " + vec.capacity());

        // prikaz elemenata vectora
        Enumeration en = vec.elements();
        System.out.println("\n elements are .");
        while(en.hasMoreElements()){
            System.out.print(en.nextElement()+" ");
        }


    }
}
