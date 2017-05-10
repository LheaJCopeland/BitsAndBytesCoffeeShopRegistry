package com.grandcircus;

/**
 * Created by LheaJLove on 5/9/2017.
 */
public class User {
    private String name;
    private Integer age;
    private String favoriteDrink;
    private String favoritePastry;
    private String allergies;
    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public void setFavoriteDrink(String favoriteDrink) {
        this.favoriteDrink = favoriteDrink;
    }

    public String getFavoritePastry() {
        return favoritePastry;
    }

    public void setFavoritePastry(String favoritePastry) {
        this.favoritePastry = favoritePastry;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
