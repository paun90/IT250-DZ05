/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milospaunovic.methotels.pages;

import com.milospaunovic.methotels.data.Soba;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;

/**
 *
 * @author Paun
 */
public class DodavanjeSoba {
    @Property
    ArrayList<Soba>listaSoba = new ArrayList();
    
    @Property
    private Soba sob1;
    
    Object onSuccess() {
        listaSoba.add(sob1);
        return this;
 }
    
    void onActivate() {
        if (listaSoba == null) {
        listaSoba = new ArrayList<Soba>();
        }
    }
}
