package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Subject2 {
private List<Observer2> observers=new ArrayList<Observer2>();
public void attach(Observer2 observer){
	observers.add(observer);
}
public void remove(Observer2 observer){
	observers.remove(observer);
}
public void notifySubject(){
	for(Observer2 observer : observers){
		observer.update(this);
	}
}
}
