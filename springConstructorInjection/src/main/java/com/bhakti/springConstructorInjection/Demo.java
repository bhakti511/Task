package com.bhakti.springConstructorInjection;

public class Demo {
	
	String name;
	
	
	
	public Demo(String name) {
		super();
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	@Override
	public String toString() {
		return "Welcome " +name+ "";
	}
	

}
