package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {
        @Test
    public void TestAnnounce(){
            Person person = new Person();
            person.setFirstName("Stas");
            person.setSecondName("Gavajdka");
            person.setAge(35);
            person.announce();
            assertThat(person.announce(),is("My name is Stas Gavajdka and I am 35"));
        }

    }
