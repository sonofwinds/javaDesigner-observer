package com.service.impl;

import com.service.Observer2;
import com.service.Subject2;

public class ConcreteObserver2 implements Observer2 {

	@Override
	public void update(Subject2 subject) {
		String state=((ConcreteSubject2)subject).getState();
     System.out.println(this.getClass().getSimpleName()+"已经更新状态为:"+state);		
	}

}
