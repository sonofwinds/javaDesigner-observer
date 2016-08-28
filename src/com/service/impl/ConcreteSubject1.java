package com.service.impl;

import com.service.Subject1;

public class ConcreteSubject1 extends Subject1 {
	private String state;

	public String getState() {
		return state;
	}

	public void change(String state) {
		this.state=state;
		this.notifySubject(state);
	}
}
