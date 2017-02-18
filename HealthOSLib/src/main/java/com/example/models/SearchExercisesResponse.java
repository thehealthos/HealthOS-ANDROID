/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SearchExercisesResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4938489084120620059L;
    private String name;
    private String category;
    private String caloryCount;
    private String cardioSubcategory;
    private String primaryMuscleGroup;
    private String excerciseId;
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
    @JsonGetter("category")
    public String getCategory ( ) { 
        return this.category;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("category")
    public void setCategory (String value) { 
        this.category = value;
        notifyObservers(this.category);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("calory_count")
    public String getCaloryCount ( ) { 
        return this.caloryCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("calory_count")
    public void setCaloryCount (String value) { 
        this.caloryCount = value;
        notifyObservers(this.caloryCount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cardio_subcategory")
    public String getCardioSubcategory ( ) { 
        return this.cardioSubcategory;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cardio_subcategory")
    public void setCardioSubcategory (String value) { 
        this.cardioSubcategory = value;
        notifyObservers(this.cardioSubcategory);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("primary_muscle_group")
    public String getPrimaryMuscleGroup ( ) { 
        return this.primaryMuscleGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("primary_muscle_group")
    public void setPrimaryMuscleGroup (String value) { 
        this.primaryMuscleGroup = value;
        notifyObservers(this.primaryMuscleGroup);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("excercise_id")
    public String getExcerciseId ( ) { 
        return this.excerciseId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("excercise_id")
    public void setExcerciseId (String value) { 
        this.excerciseId = value;
        notifyObservers(this.excerciseId);
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
 