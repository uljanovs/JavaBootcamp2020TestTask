package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {
    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testCheckPersonFirstNameCreatedProperly() throws NewException {
        Person person = new Person();
        person.setFirstName("Test");
        assertEquals("I am an error message", "Test", person.getFirstName());
    }

    @Test
    public void testCheckPersonSecondNameCreatedProperly() throws NewException {
        Person person = new Person();
        person.setSecondName("Test");
        assertEquals("I am an error message", "Test", person.getSecondName());
    }

    @Test
    public void testCheckPersonAgeCreatedProperly() {
        Person person = new Person();
        person.setAge(21);
        assertEquals("I am an error message", 21, person.getAge());
    }


}
//"My name is Test Test and I am 21 years old"