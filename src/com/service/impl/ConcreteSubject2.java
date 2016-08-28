package com.service.impl;

import com.service.Subject2;

public class ConcreteSubject2 extends Subject2 {
	private String state;

	public String getState() {
		return state;
	}

	public void change(String state) {
		this.state=state;
		this.notifySubject();
	}
}
