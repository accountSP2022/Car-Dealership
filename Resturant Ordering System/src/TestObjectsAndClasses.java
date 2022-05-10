
import static edu.sdmesa.cisc191.M2ArrayChallenge.copy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestObjectsAndClasses
{
	// for Item class - Riley
	@Test
	void testItemNoArgConstructor()
	{
		Item bigMac = new Item();
		assertEquals(null, bigMac.getItemName());
	}
	
	@Test
	void testItemConstructor()
	{
		Item bigMac = new Item("BIG MAC", 20);
		assertEquals("BIG MAC", bigMac.getItemName());
	}

	@Test
	void testItemMutators()
	{
		Item bigMac = new Item("BIG MAC", 20);
		bigMac.setItemName("NOT BIG MAC");
		assertEquals("NOT BIG MAC", bigMac.getItemName());
		
		bigMac.setPrice(100.0);
		assertEquals(100.0, bigMac.getPrice());
	}

	
	// for Cart class
	
	@Test
	void testClearingCart() 
	{
		Item bigMac = new Item("BIG MAC", 20);
		Cart a = new Cart();
		Cart b = new Cart();
		assertArrayEquals(b.viewCart(), a.viewCart() );
		a.addToCart(bigMac);
		b.addToCart(bigMac);
		assertArrayEquals(b.viewCart(), a.viewCart() );
		System.out.println(a.itemsInCart[0]);
		a.clearCart();
		assertNotEquals(b.viewCart(), a.viewCart());
		System.out.println(a.itemsInCart[0] + "hello");
		assertEquals(bigMac.getPrice(), a.displaySubtotal());
	}
	
	
}
