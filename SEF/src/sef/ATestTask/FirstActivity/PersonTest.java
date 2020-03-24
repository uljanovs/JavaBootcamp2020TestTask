package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PersonTest extends TestCase {

    public void testEmptyConstructor() {
        Person person = new Person();
        person.setFirstName("Oprah");
        person.setSecondName("Winfrey");
        person.setAge(66);


        assertEquals("I am an error message", "Oprah", person.getFirstName());

        assertThat(person.getAge(), is(66));

        assertThat(person.getFirstName(), is("Oprah"));

        assertThat(person.getSecondName(), is("Winfrey"));
    }
}