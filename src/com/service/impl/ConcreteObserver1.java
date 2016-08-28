package com.service.impl;

import com.service.Observer1;

public class ConcreteObserver1 implements Observer1 {

	@Override
	public void update(String state) {
     System.out.println(this.getClass().getSimpleName()+"已经更新状态为:"+state);		
	}

}
