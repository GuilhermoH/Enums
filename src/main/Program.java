package main;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order order= new Order(1900,new Date(),OrderStatus.PROCESSING);
		System.out.println(order);
	}

}
