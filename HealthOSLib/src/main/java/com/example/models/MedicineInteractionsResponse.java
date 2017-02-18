/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MedicineInteractionsResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4778654511511527708L;
    private String generic;
    private List<Interaction> interactions;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("generic")
    public String getGeneric ( ) { 
        return this.generic;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("generic")
    public void setGeneric (String value) { 
        this.generic = value;
        notifyObservers(this.generic);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("interactions")
    public List<Interaction> getInteractions ( ) { 
        return this.interactions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("interactions")
    public void setInteractions (List<Interaction> value) { 
        this.interactions = value;
        notifyObservers(this.interactions);
    }
 
}
 