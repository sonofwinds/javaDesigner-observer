package com.test;

import com.service.Observer1;
import com.service.Subject1;
import com.service.impl.ConcreteObserver1;
import com.service.impl.ConcreteSubject1;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  ConcreteSubject1 subject=new ConcreteSubject1();
          Observer1 observer1=new ConcreteObserver1();
          Observer1 observer2=new ConcreteObserver1();
          Observer1 observer3=new ConcreteObserver1();
          subject.attach(observer1);
          subject.attach(observer2);
          subject.attach(observer3);
          subject.change("正常");
	}

}
