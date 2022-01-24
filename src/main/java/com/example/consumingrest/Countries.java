package com.example.consumingrest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Countries {
	
	 private String name;
	 private String capital;
	 private int population;
	 
	 public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }

		  public String getCap() {
		    return capital;
		  }

		  public void setCap(String cap) {
		    this.capital = cap;
		  }
		  
		  
		  public int getPop() {
			  return population;
		  }
		  
		  public void setPop(int pop) {
			  this.population = pop;
		  }

		  
		  @Override
		  public String toString() {
		    return "Country{" +
		        "name='" + name + '\'' +
		        ", capital=" + capital +
		        ", population=" + population +
		        '}';
		  }
	 

}
