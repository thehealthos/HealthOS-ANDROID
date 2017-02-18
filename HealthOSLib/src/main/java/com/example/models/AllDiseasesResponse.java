/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AllDiseasesResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5192667576092343496L;
    private String diseaseName;
    private String diseaseCat;
    private String diseaseInfo;
    private String diseaseId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("disease_name")
    public String getDiseaseName ( ) { 
        return this.diseaseName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("disease_name")
    public void setDiseaseName (String value) { 
        this.diseaseName = value;
        notifyObservers(this.diseaseName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("disease_cat")
    public String getDiseaseCat ( ) { 
        return this.diseaseCat;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("disease_cat")
    public void setDiseaseCat (String value) { 
        this.diseaseCat = value;
        notifyObservers(this.diseaseCat);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("disease_info")
    public String getDiseaseInfo ( ) { 
        return this.diseaseInfo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("disease_info")
    public void setDiseaseInfo (String value) { 
        this.diseaseInfo = value;
        notifyObservers(this.diseaseInfo);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("disease_id")
    public String getDiseaseId ( ) { 
        return this.diseaseId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("disease_id")
    public void setDiseaseId (String value) { 
        this.diseaseId = value;
        notifyObservers(this.diseaseId);
    }
 
}
 