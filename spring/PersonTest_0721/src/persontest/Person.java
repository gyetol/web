package persontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Person {
	private String name;
	private HashMap<String,Integer> map;
	
	public Person() {}

	public Person(String name, HashMap<String, Integer> map) {
		this.name = name;
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	
	public int tot() {
		int sum=0;
		Collection<Integer> score= map.values();
		for(Integer value: score ) {
			sum+=value;
		}
		return sum;
	}
	
	public double avg() {
		int cnt=0;
		Collection<Integer> score= map.values();
		for(Integer value: score ) {
			cnt++;
		}
		return tot()/cnt;
	}

	public void print() {
		System.out.printf("%s: %d %.2f",name,tot(),avg());
	}
	
	

}
