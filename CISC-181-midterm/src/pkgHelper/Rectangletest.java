package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgGame.Rectangle;

public class Rectangletest {

	@Test
	public void Rectangle_constructor_test() {
		Rectangle R = new Rectangle(1, 2);
		int width = 2;
		R.setiWidth(2);
		int iwidth = R.getiWidth();
		assertEquals(width,iwidth);
	}
	
	@Test
	public void setWidth_test2() {
		Rectangle R = new Rectangle(3,5);
		int width3 = 3;
		R.setiWidth(3);
		int width4 = R.getiWidth();
		assertTrue(width3 == width4);
	}
	
	@Test
	public void getWidth_test2() {
		Rectangle H = new Rectangle(3,5);
		assertFalse(6 == H.getiWidth());
	}
	
	@Test
	public void get_and_setiLength_test() {
		Rectangle R = new Rectangle(1,2);
		int width1 = 1;
		R.setiLength(1);
		int width2 = R.getiLength();
		assertEquals(width1,width2);
		
	}
	
	@Test
	public void area_test() {
		Rectangle R = new Rectangle(1,2);
		double area1 = R.area();
		int width2 = R.getiLength();
		int width1 = R.getiWidth();
		assertTrue(area1== width2*width1);
	}
	
	@Test
	public void perimeter_test() {
		Rectangle R = new Rectangle(1,2);
		double perimeter1 = R.perimeter();
		int width2 = R.getiLength();
		int width1 = R.getiWidth();
		int perimeter2 = 2*(width2+width1);
		assertTrue(perimeter1 == perimeter2);
	}
	
	@Test
	public void compareTo_test1() {
		Rectangle L = new Rectangle(7,8);
		Rectangle B = new Rectangle(7,8);
		assertEquals(0, B.compareTo(L));
	}
	
	@Test
	public void compareTo_test2() {
		Rectangle L = new Rectangle(7,8);
		Rectangle B = new Rectangle(7,9);
		assertEquals(1, B.compareTo(L));
	
	}
	
	@Test 
	public void compareTo_test3() {
		Rectangle L = new Rectangle(6,9);
		Rectangle B = new Rectangle(4,5);
		assertEquals(-1, B.compareTo(L));
	}
	
	@Test
	public void Throwexception_test1() {
		boolean thrown = false;
		Rectangle G = new Rectangle(50,500);
		try {
			G.setiWidth(-10);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	
	
	
	@Test
	public void Throwexception_test2() {
		boolean thrown = false;
		Rectangle G = new Rectangle(50,500);
		try {
			G.setiLength(-60);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Throwexception_test3() {
		boolean thrown = false;
		
		try {
			Rectangle G = new Rectangle(-50,-500);
			
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	
	@Test
	public void Throwexception_test4() {
		boolean thrown = false;
		
		try {
			Rectangle G = new Rectangle(50,-500);
			
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	
}

	

