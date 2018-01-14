package com.et.lession01_autowire;

import java.util.List;

public class B {
	private List<A> a;

	public List<A> getA() {
		return a;
	}

	public void setA(List<A> a) {
		this.a = a;
	}

	/*public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}*/
	
}
