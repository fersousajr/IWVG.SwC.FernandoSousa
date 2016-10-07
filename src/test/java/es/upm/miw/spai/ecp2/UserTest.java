package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void testGetNameUpperCase() {
		User user = new User(0, "Eneas", "Macías");
		assertEquals("ENEAS", user.getNameUpperCase());
	}

}
