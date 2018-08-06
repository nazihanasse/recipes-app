package com.nazih.recipes.entities;

import javax.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private Recipe recipe;
    @OneToOne
    private UnitOfMeasure unitOfMeasure;

    public Ingredient() {
    }

    public Ingredient(String name, String description, Recipe recipe) {
        this.name = name;
        this.description = description;
        this.recipe = recipe;
    }

    public Ingredient(String name, String description, UnitOfMeasure unitOfMeasure) {
        this.name = name;
        this.description = description;
        this.unitOfMeasure = unitOfMeasure;
    }

    public Ingredient(String name, String description, Recipe recipe, UnitOfMeasure unitOfMeasure) {
        this.name = name;
        this.description = description;
        this.recipe = recipe;
        this.unitOfMeasure = unitOfMeasure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
