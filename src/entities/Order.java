package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
private OrderStatus status;
private Integer id;
private Date moment;

public Order() {
}

public Order(Integer a,Date b,OrderStatus c) {
	id=a;
	moment=b;
	status=c;			
}

public OrderStatus getStatus() {
	return status;
}

public void setStatus(OrderStatus status) {
	this.status = status;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Date getMoment() {
	return moment;
}

public void setMoment(Date moment) {
	this.moment = moment;
}

public String toString() {
	return "Order [ID="+id+"  DATA: "+moment+"  STATUS:   "+status+"]";
}
}