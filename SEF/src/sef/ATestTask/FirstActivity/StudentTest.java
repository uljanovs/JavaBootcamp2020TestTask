package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {
    @Test
    public void TestAnnounce(){
        Student student = new Student();
        student.setSchoolName("Bootcamp");
        student.setFirstName("Dmitrij");
        student.setSecondName("Solo");
        student.setAge(28);
        student.announce();

        assertThat(student.announce(),is("My name is Dmitrij Solo and I am 28. I am study in university Bootcamp"));
    }
}
