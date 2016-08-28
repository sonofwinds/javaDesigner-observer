package com.test;

import com.service.Observer2;
import com.service.Subject2;
import com.service.impl.ConcreteObserver2;
import com.service.impl.ConcreteSubject2;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteSubject2 subject=new ConcreteSubject2();
        Observer2 observer1=new ConcreteObserver2();
        Observer2 observer2=new ConcreteObserver2();
        Observer2 observer3=new ConcreteObserver2();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.change("正常");
	}

}
