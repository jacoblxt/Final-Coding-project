package pkgGame;


public class Rectangle extends Shape{
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iwidth1, int ilength1) {
		if(iwidth1<=0 || ilength1<=0) {
			throw new IllegalArgumentException();
		}
		this.iWidth = iwidth1;
		this.iLength = ilength1;
		
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int iwidth1) {
		if(iwidth1<=0) {
			throw new IllegalArgumentException();
		}
		this.iWidth = iwidth1;
		
	}
	
	public int getiLength() {
		return iLength;
		
	}
	
	public void setiLength(int ilength1) {
		try {
			if(ilength1<=0) {
				throw new IllegalArgumentException();}
			}
			finally {
				this.iLength=ilength1;
			}
	}
	
		
	

	

	@Override
	public double area() {
		double getiLength = this.getiLength()*this.getiWidth();
		
		return getiLength;
	}

	
	
	@Override
	public double perimeter() {
		double perimeter =2*(this.getiLength()+this.getiWidth());
		
		return perimeter;
	}
	
	public int compareTo(Object i) {
		
		if(this.area()> ((Rectangle)i).area()) {
			
			return 1;
		}
		
		else if (this.area()<((Rectangle)i).area()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

}

