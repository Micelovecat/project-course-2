package pro.sky.projectcourse2;

import org.junit.jupiter.api.Test;
import pro.sky.projectcourse2.model.Question;
import pro.sky.projectcourse2.service.impl.JavaQuestionService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaQuestionServiceImplTest {

    private final JavaQuestionService service = new JavaQuestionService();

    @Test
    public void testAddQuestion1(){
        Question expectedQuestion = new Question("question1", "answer1");
        assertEquals(0,service.getAll().size());
        assertEquals(true,service.add("question1", "answer1"));
        assertEquals(1,service.getAll().size());
        assertTrue(service.getAll().contains(expectedQuestion));
    }

    @Test
    public void testAddQuestion2(){
        Question expectedQuestion = new Question("question2", "answer2");
        assertEquals(0,service.getAll().size());
        assertEquals(true,service.add("question2", "answer2"));
        assertEquals(1,service.getAll().size());
        assertTrue(service.getAll().contains(expectedQuestion));
    }

}
