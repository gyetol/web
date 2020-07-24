package org.example.mvcTest;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private Info info;
	private List<Integer> jumsu;
	
	public Student() {
		this(new Info(),new ArrayList<Integer>());
	}

	public Student(Info info, List<Integer> jumsu) {
		super();
		this.info = info;
		this.jumsu = jumsu;
	}

	public Info getInfo() {
		return info;
	}

	public List<Integer> getJumsu() {
		return jumsu;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public void setJumsu(List<Integer> jumsu) {
		this.jumsu = jumsu;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(info.toString());
		for(Integer j : jumsu) {
			sb.append(" "+j);
		}
		return sb.toString();
	}
	
	
	
	
}
