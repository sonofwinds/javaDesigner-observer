package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Subject1 {
private List<Observer1> observers=new ArrayList<Observer1>();
public void attach(Observer1 observer){
	observers.add(observer);
}
public void remove(Observer1 observer){
	observers.remove(observer);
}
public void notifySubject(String state){
	for(Observer1 observer : observers){
		observer.update(state);
	}
}
}
