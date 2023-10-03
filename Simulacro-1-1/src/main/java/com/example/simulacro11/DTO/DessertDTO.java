package com.example.simulacro11.DTO;

import com.example.simulacro11.entities.Dessert;
import com.example.simulacro11.entities.Ingredents;

import javax.persistence.Column;

public class DessertDTO {
    private int idDessert;
    private String nameDessert;
    private String descriptionDessert;
    private int preparationTimeDessert;
    private String difficultyDessert;
    private String categoryDessert;




    public int getIdDessert() {
        return idDessert;
    }

    public void setIdDessert(int idDessert) {
        this.idDessert = idDessert;
    }

    public String getNameDessert() {
        return nameDessert;
    }

    public void setNameDessert(String nameDessert) {
        this.nameDessert = nameDessert;
    }

    public String getDescriptionDessert() {
        return descriptionDessert;
    }

    public void setDescriptionDessert(String descriptionDessert) {
        this.descriptionDessert = descriptionDessert;
    }

    public int getPreparationTimeDessert() {
        return preparationTimeDessert;
    }

    public void setPreparationTimeDessert(int preparationTimeDessert) {
        this.preparationTimeDessert = preparationTimeDessert;
    }

    public String getDifficultyDessert() {
        return difficultyDessert;
    }

    public void setDifficultyDessert(String difficultyDessert) {
        this.difficultyDessert = difficultyDessert;
    }

    public String getCategoryDessert() {
        return categoryDessert;
    }

    public void setCategoryDessert(String categoryDessert) {
        this.categoryDessert = categoryDessert;
    }


}
