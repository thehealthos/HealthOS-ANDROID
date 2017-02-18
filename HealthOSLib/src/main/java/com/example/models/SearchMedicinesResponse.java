/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SearchMedicinesResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4879895491890717261L;
    private String name;
    private String form;
    private int standardUnits;
    private String packageForm;
    private double price;
    private String size;
    private String manufacturer;
    private List<Constituent> constituents;
    private Schedule schedule;
    private String id;
    private String medicineId;
    private double searchScore;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("form")
    public String getForm ( ) { 
        return this.form;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("form")
    public void setForm (String value) { 
        this.form = value;
        notifyObservers(this.form);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("standardUnits")
    public int getStandardUnits ( ) { 
        return this.standardUnits;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("standardUnits")
    public void setStandardUnits (int value) { 
        this.standardUnits = value;
        notifyObservers(this.standardUnits);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("packageForm")
    public String getPackageForm ( ) { 
        return this.packageForm;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("packageForm")
    public void setPackageForm (String value) { 
        this.packageForm = value;
        notifyObservers(this.packageForm);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("price")
    public double getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("price")
    public void setPrice (double value) { 
        this.price = value;
        notifyObservers(this.price);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("size")
    public String getSize ( ) { 
        return this.size;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("size")
    public void setSize (String value) { 
        this.size = value;
        notifyObservers(this.size);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("manufacturer")
    public String getManufacturer ( ) { 
        return this.manufacturer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("manufacturer")
    public void setManufacturer (String value) { 
        this.manufacturer = value;
        notifyObservers(this.manufacturer);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("constituents")
    public List<Constituent> getConstituents ( ) { 
        return this.constituents;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("constituents")
    public void setConstituents (List<Constituent> value) { 
        this.constituents = value;
        notifyObservers(this.constituents);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("schedule")
    public Schedule getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("schedule")
    public void setSchedule (Schedule value) { 
        this.schedule = value;
        notifyObservers(this.schedule);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("medicine_id")
    public String getMedicineId ( ) { 
        return this.medicineId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("medicine_id")
    public void setMedicineId (String value) { 
        this.medicineId = value;
        notifyObservers(this.medicineId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("search_score")
    public double getSearchScore ( ) { 
        return this.searchScore;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("search_score")
    public void setSearchScore (double value) { 
        this.searchScore = value;
        notifyObservers(this.searchScore);
    }
 
}
 