package SEF.src.sef.ATestTask.FirstActivity;


import junit.framework.TestCase;

public class PersonTest extends TestCase{

        public void testcheckPersonCreatedProperly(){
            Person person = new Person();
            person.setFirstName("Zane");
            assertEquals("I am an error message", "Zane", person.getFirstName());
        }

    }

