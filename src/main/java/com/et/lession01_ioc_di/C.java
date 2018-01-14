package com.et.lession01_ioc_di;

import com.et.lession01.B;

public class C {
	private String id;
	private String name;
	private B b;
	public C(String id, String name, B b) {
		super();
		this.id = id;
		this.name = name;
		this.b = b;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	
	
}
