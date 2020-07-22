package spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("user")
public class User {
	private ArrayList<String> users;
	private Map<String,Integer> scores;
	
	
	public User() {
		this.users= new ArrayList<String>();
		this.scores=new HashMap<String,Integer>();
	}
	public void setUsers(ArrayList<String> users) {
		this.users = users;
	}
	
	public void setScores(Map<String,Integer> scores) {
		this.scores=scores;
	}
	
	public void print() {
		for(String name: users) {
			System.out.println(name);
		}
	}
	
	public void scorePrint() {
		Set<String> keySet = scores.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			System.out.println(key + " : " +scores.get(key));
		}
	}
}
