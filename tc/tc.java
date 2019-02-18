import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class tc {
	@BeforeClass
	public static void setUpbeforeClass() throws Exception{
		Cart c = new Cart();
		Book b= new Book("Java", 1, 127.0);
	}
	
	@Test
	public void testEmptyCart() {
		Cart c= new Cart();
		assertEquals(0, c.getCount());
	}
	
	@Test
	public void testCart1() {
		Cart c= new Cart();
		Book b= new Book("Java", 1, 127.0);
		c.addBook(b);
		assertEquals(1, c.getCount());
		assertTrue(127.0== c.getTotalPrice());

	}
	
	@Test
	public void testCart() {
		Cart c= new Cart();
		Book b1= new Book("Java", 2, 127.0);
		Book b2= new Book("Web Design", 1, 100.0);
		c.addBook(b1);
		c.addBook(b2);
		assertEquals(3, c.getCount());
		assertTrue(354.0== c.getTotalPrice());
	}
}
