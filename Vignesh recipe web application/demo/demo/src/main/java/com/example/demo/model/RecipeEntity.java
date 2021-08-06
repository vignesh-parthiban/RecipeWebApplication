package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipetable")
public class RecipeEntity {
	
		@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	    private String Dish_Type;
	    private int Suitable_for;
	    private String Ingredients;
	    private String Cooking_Instructions;	    
	    private String Date_Time;   
	    		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDate_Time() {
			return Date_Time;
		}
		public void setDate_Time(String date_Time) {
			Date_Time = date_Time;
		}
		public String getDish_Type() {
			return Dish_Type;
		}
		public void setDish_Type(String dish_Type) {
			Dish_Type = dish_Type;
		}
		public int getSuitable_for() {
			return Suitable_for;
		}
		public void setSuitable_for(int suitable_for) {
			Suitable_for = suitable_for;
		}
		public String getIngredients() {
			return Ingredients;
		}
		public void setIngredients(String ingredients) {
			Ingredients = ingredients;
		}
		public String getCooking_Instructions() {
			return Cooking_Instructions;
		}
		public void setCooking_Instructions(String cooking_Instructions) {
			Cooking_Instructions = cooking_Instructions;
		}
		

		public RecipeEntity() {
	 
		}
		public RecipeEntity(Long id, String dishtype, int suitablefor, String ingredients, String cookinginstructions, String datetime) {
		
			this.id = id;
			this.Dish_Type = dishtype;
			this.Suitable_for = suitablefor;
			this.Ingredients = ingredients;
			this.Cooking_Instructions = cookinginstructions;
			this.Date_Time = datetime;
		}
	}
