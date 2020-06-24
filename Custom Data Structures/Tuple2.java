package com.custom.dataStructures;

public class Tuple2<T,U> {
	private T value1;

	private U value2;
	
	public Tuple2(T first, U second){
		this.value1 = first;
		this.value2 = second;
	}

	public T getValue1() {
		return value1;
	}

	public U getValue2() {
		return value2;
	}
	
}
