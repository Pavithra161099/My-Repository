package com.corejavapractise;

public class ProducerConsumerProblem {

	public static void main(String[] args) {

		Factory f = new Factory();

		new Producer(f).start();
		new Consumer(f).start();

	}

}
