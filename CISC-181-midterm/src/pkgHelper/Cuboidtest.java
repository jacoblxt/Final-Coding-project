package pkgHelper;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Test;

import pkgGame.Cuboid;
import pkgGame.Cuboid.SortByArea;
import pkgGame.Cuboid.SortByVolume;
import pkgGame.Rectangle;

public class Cuboidtest {

	@Test
	public void Cuboid_constructor_test() {
		Cuboid R = new Cuboid(1,2,3);
		int idepth = 3;
		R.setiDepth(3);
		int depth = R.getiDepth();
		assertEquals(idepth,depth);
	}
	
	@Test
	public void Cuboid_volume_test() {
		Cuboid R = new Cuboid(1,2,3);
		double volume1 = R.volume();
		int length1 = R.getiLength();
		int width1 = R.getiWidth();
		int depth1 = R.getiDepth();
		assertTrue(volume1 == length1*width1*depth1);
	}
	
	@Test
	public void Cuboid_area_test() {
		Cuboid R = new Cuboid(1,2,3);
		double perimeter1 = R.area();
		int length4 = 2*(R.getiLength()*R.getiWidth());
		int width3 = 2*(R.getiWidth()*R.getiDepth());
		int depth4 = 2*(R.getiDepth()*R.getiLength());
		
		assertTrue(length4+width3+depth4 == perimeter1);}
	
	@Test(expected = UnsupportedOperationException.class)
	public void Cuboid_perimeter_test() {
		Cuboid R = new Cuboid(34,45,67);
		R.perimeter();
		
		
	}
	
	
	
	@Test
	public void compareTo_test1() {
		Cuboid L = new Cuboid(7,8,9);
		Cuboid B = new Cuboid(7,8,9);
		assertEquals(0, B.compareTo(L));
	}
	
	@Test
	public void compareTo_test2() {
		Cuboid L = new Cuboid(4,4,5);
		Cuboid B = new Cuboid(2,2,2);
		assertEquals(-1, B.compareTo(L));
	}
	
	@Test
	public void compareTo_test3() {
		Cuboid L = new Cuboid(1,1,1);
		Cuboid B = new Cuboid(2,2,2);
		assertEquals(1, B.compareTo(L));
	}
	
	
	
	
	@Test
	public void Cuboid_throwexception_test1() {
		boolean thrown = false;
		Cuboid G = new Cuboid(50,500,50);
		try {
			G.setiDepth(-10000);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	
	
	@Test
	public void Cuboid_throwexception_test2() {
		boolean thrown = false;
		try {
			Cuboid N = new Cuboid(50,500,-50);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	
	@Test
	public void SortByArea_test1() {
		Cuboid R = new Cuboid(55,76,78);
		Cuboid r = new Cuboid(55,76,78);
		SortByArea area = r.new SortByArea();
		assertTrue(area.compare(R, r)==0);
	}
	
	@Test
	public void SortByArea_test2() {
		Cuboid R = new Cuboid(45,45,35);
		Cuboid r = new Cuboid(456,456,456);
		SortByArea area = r.new SortByArea();
		assertTrue(area.compare(R, r)==-1);
	}
	@Test
	public void SortByArea_test3() {
		Cuboid R = new Cuboid(4563,5673,5673);
		Cuboid r = new Cuboid(345,345,456);
		SortByArea area1 = r.new SortByArea();
		assertTrue(area1.compare(R, r)==1);
	}
	
	@Test
	public void SortByVolume_test1() {
		Cuboid R = new Cuboid(1111,2222,3333);
		Cuboid r = new Cuboid(22,33,44);
		SortByVolume vol = r.new SortByVolume(); 
		assertTrue(vol.compare(r,R)== 1);
		
	}
	@Test
	public void SortByVolume_test2() {
		Cuboid R = new Cuboid(22,33,44);
		Cuboid r = new Cuboid(22,33,44);
		SortByVolume vol = r.new SortByVolume();
		assertTrue(vol.compare(R,r)== 0);
	}
	@Test
	public void SortByVolume_test3() {
		Cuboid R = new Cuboid(2,3,4);
		Cuboid r = new Cuboid(445,334,446);
		SortByVolume vol = r.new SortByVolume();
		
		assertTrue(vol.compare(R,r)== -1);
		
	}



}

	
	
