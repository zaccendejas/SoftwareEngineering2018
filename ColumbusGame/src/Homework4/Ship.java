package Homework4;

import java.util.concurrent.ThreadLocalRandom;


public class Ship {
	
	Point location = new Point();
	
	public Ship() {
		location.setX(ThreadLocalRandom.current().nextInt(0, 25));
		location.setY(ThreadLocalRandom.current().nextInt(0, 25));
	};
	
	public Point getShipLocation() {
		return location;
	}
	
	public void setX(int x) {location.setX(x);}
	
	public void setY(int y) {location.setY(y);}

}
