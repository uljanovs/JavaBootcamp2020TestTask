package sef.ATestTask.FirstActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PersonTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSetAndGetFirstName() {
        String testFirstName = "First Name";
        assertNull(Person.getFirstName());
        Person.setFirstName(testFirstName);
        assertEquals(testFirstName, Person.getFirstName());
    }
    @Test
    public void testSetAndGetAge() {
        int testAge = 18;
        assertNull(Person.getAge());
        Person.setAge(testAge);
        assertEquals(testAge, Person.getAge());
    }

    @Test
    public void testSetAndGetSecondName() {
        String testSecondName = "Second Name";
        assertNull(Person.getSecondName());
        Person.setFirstName(testSecondName);
        assertEquals(testSecondName, Person.getSecondName());
    }
}
