package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;


public class PersonTest extends TestCase {

        @Test
        public void testCheckPersonCreatedProperly(){
            Person person = new Person();
            person.setFirstName("Test1");
            assertEquals("I am an error message", "Test1", person.getFirstName());
        }

    }

