package ch.hslu.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void compareTo() throws Exception {
        Person test = new Person("Muster", "Max");
        Person test2 = new Person("Tester", "Hans");
        assertEquals(-1, test.compareTo(test2));
    }

    @Test
    public void compareToLower() throws Exception {
        Person test = new Person("Muster", "Max");
        Person test2 = new Person("Tester", "Hans");
        assertEquals(1, test2.compareTo(test));
    }

    @Test
    public void getId() throws Exception {
        Person test = new Person("Muster", "Max");
        Person test2 = new Person("Tester", "Hans");
        assertNotEquals(test.getId(), test2.getId());
    }
    @Test
    public void getIdIncrement() throws Exception {
        Person test = new Person("Muster", "Max");
        Person test2 = new Person("Tester", "Hans");
        assertEquals(1, test2.getId()-test.getId());
    }

    @Test
    public void equalsVerify() throws Exception {
        EqualsVerifier.forClass(Person.class).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).verify();
    }

    @Test
    public void equals() throws Exception {
        Person test = new Person("Muster", "Max");
        Person test2 = test;
        assertEquals(true, test.equals(test2));
    }
    @Test
    public void doesNotequal() throws Exception {
        Person test = new Person("Muster", "Max");
        Person test2 = new Person("Muster", "Max");
        assertEquals(false, test.equals(test2));
    }

    @Test
    public void toStringTest() throws Exception {
        Person test = new Person("Muster", "Max");
        System.out.print(test.toString());
    }

    @Test
    public void getLastname() throws Exception {
        Person test = new Person("Muster", "Max");
        assertEquals("Muster", test.getLastname());
    }

    @Test
    public void getForname() throws Exception {
        Person test = new Person("Muster", "Max");
        assertEquals("Max",test.getForname());
    }
}