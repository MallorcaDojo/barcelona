package de.cofinpro.bierdeckel.domain;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 21.09.13
 * Time: 13:33
 * To change this template use File | Settings | File Templates.
 */
public class Person implements Serializable {
    private String name;

     public void setName(String name) {
         this.name = name;
     }

    public String getName() {
        return this.name;
    }
}
