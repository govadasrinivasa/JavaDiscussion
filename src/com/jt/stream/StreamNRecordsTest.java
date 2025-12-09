package com.jt.stream;

import java.util.List;

public class StreamNRecordsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City newYork = new City("New York", 800000);
		City losAngeles = new City("Los Angeles", 7000000);
		Country usa = new Country("USA", List.of(newYork, losAngeles));

		City london = new City("London", 8000000); 
		City manchester = new City("Manchester", 5000000);
		Country uk = new Country("United Kindgom", List.of(london, manchester));

		City kolkatta = new City("Kolkatta", 2000000); 
		City blore = new City("Bengaluru", 8700000);
		Country india = new Country("India", List.of(kolkatta, blore));
		
		List<Country> countries = List.of(usa,uk,india);
		
		int totalpopulation = countries.stream().flatMap(country -> country.cities().stream()).mapToInt(City::population).sum();
		System.out.println(totalpopulation);
	}

}
record City(String name, int population){}
record Country(String name, List<City> cities) {}