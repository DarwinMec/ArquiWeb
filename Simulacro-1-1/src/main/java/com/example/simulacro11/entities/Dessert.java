package com.example.simulacro11.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="desserts")
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDessert;

    @Column(name = "nameDessert",length = 45,nullable = false)
    private String nameDessert;
    @Column(name = "descriptionDessert",length = 45,nullable = false)
    private String descriptionDessert;
    @Column(name = "preparationTimeDessert",nullable = false)
    private int preparationTimeDessert;
    @Column(name = "difficultyDessert",length = 45,nullable = false)
    private String difficultyDessert;

    @Column(name = "categoryDessert",length = 45,nullable = false)
    private String categoryDessert;

    public Dessert(){}


    public Dessert(int idDessert, String nameDessert, String descriptionDessert, int preparationTimeDessert, String difficultyDessert, String categoryDessert) {
        this.idDessert = idDessert;
        this.nameDessert = nameDessert;
        this.descriptionDessert = descriptionDessert;
        this.preparationTimeDessert = preparationTimeDessert;
        this.difficultyDessert = difficultyDessert;
        this.categoryDessert = categoryDessert;

    }

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
