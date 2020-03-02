package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void checkPersonCreatedProperly(){
        Person person = new Person();
        person.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", person.getFirstName());
    }

}