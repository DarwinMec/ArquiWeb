package com.example.simulacro11.DTO;

import com.example.simulacro11.entities.Dessert;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class IngredentsDTO {
    private int idIngredient;
    private String nameIngredient;
    private int quantityIngredient;
    private String unitMeasurementIngredient;
    private Dessert dessert;



    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public int getQuantityIngredient() {
        return quantityIngredient;
    }

    public void setQuantityIngredient(int quantityIngredient) {
        this.quantityIngredient = quantityIngredient;
    }

    public String getUnitMeasurementIngredient() {
        return unitMeasurementIngredient;
    }

    public void setUnitMeasurementIngredient(String unitMeasurementIngredient) {
        this.unitMeasurementIngredient = unitMeasurementIngredient;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
