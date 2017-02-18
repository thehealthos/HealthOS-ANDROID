/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SearchFoodItemsResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5188670284703390900L;
    private int calories;
    private String itemName;
    private double servingQty;
    private String servingUnit;
    private String foodBrandId;
    private String foodItemId;
    private double searchScore;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("calories")
    public int getCalories ( ) { 
        return this.calories;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("calories")
    public void setCalories (int value) { 
        this.calories = value;
        notifyObservers(this.calories);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("item_name")
    public String getItemName ( ) { 
        return this.itemName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("item_name")
    public void setItemName (String value) { 
        this.itemName = value;
        notifyObservers(this.itemName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("serving_qty")
    public double getServingQty ( ) { 
        return this.servingQty;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("serving_qty")
    public void setServingQty (double value) { 
        this.servingQty = value;
        notifyObservers(this.servingQty);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("serving_unit")
    public String getServingUnit ( ) { 
        return this.servingUnit;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("serving_unit")
    public void setServingUnit (String value) { 
        this.servingUnit = value;
        notifyObservers(this.servingUnit);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("food_brand_id")
    public String getFoodBrandId ( ) { 
        return this.foodBrandId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("food_brand_id")
    public void setFoodBrandId (String value) { 
        this.foodBrandId = value;
        notifyObservers(this.foodBrandId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("food_item_id")
    public String getFoodItemId ( ) { 
        return this.foodItemId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("food_item_id")
    public void setFoodItemId (String value) { 
        this.foodItemId = value;
        notifyObservers(this.foodItemId);
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
 