package pkgGame;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	public Cuboid(int iwidth1, int ilength1 , int idepth) {
		super(iwidth1, ilength1);
		if(idepth<=0) {
			throw new IllegalArgumentException();
		}
		this.iDepth = idepth;
		// TODO Auto-generated constructor stub
	}

	private int iDepth;
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		if(iDepth<=0) {
			throw new IllegalArgumentException();
		}
		this.iDepth = iDepth;
	}
	
	public double area() {
		double area1 = 2*((getiLength()*getiWidth())+(getiDepth()*getiLength())+(getiDepth()*getiWidth()));
		return area1;
		
	}
	
	public double volume() {
		return this.getiDepth()*this.getiLength()*this.getiWidth();
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
		
			
		
		
	
	
	public int compareTo(Object r) {
		if(this.area() > ((Cuboid)r).area()) {
			return 1;
		}
		else if (this.area() < ((Cuboid)r).area()) {
			return -1;
		}
		else {
			return 0;
		}
	
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		public SortByArea (){
		}

		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			if(o1.area() > o2.area()) {
				return 1;
			}
			else if (o1.area() < o2.area()) {
				return -1;
			}
			else {
				return 0;
			}
			
				
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		public SortByVolume(){}

		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			
			if(o1.volume() > o2.volume()) {
				return 1;
			}
			else if (o1.volume() < o2.volume()) {
				return -1;
			}
			else { 
				return 0;
			}
		}
				
			
			
	}

}
