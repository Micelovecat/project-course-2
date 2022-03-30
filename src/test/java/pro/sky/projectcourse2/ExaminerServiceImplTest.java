package pro.sky.projectcourse2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.projectcourse2.exception.InvalidExamGenerateException;
import pro.sky.projectcourse2.model.Question;
import pro.sky.projectcourse2.service.impl.ExaminerServiceImpl;
import pro.sky.projectcourse2.service.impl.JavaQuestionService;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionService javaQuestionService;

    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    public void shouldReturnTheSamNumberOfQuestions1() throws InvalidExamGenerateException{
        Question question1 = new Question("q", "a");

        when(javaQuestionService.getAll()).thenReturn(Set.of(question1));

        when(javaQuestionService.getSize()).thenReturn(1);

        assertEquals(javaQuestionService.getAll().size(), out.getQuestions(1).size());

    }

    @Test
    public void shouldReturnTheSamNumberOfQuestions2() throws InvalidExamGenerateException{
        Question question2 = new Question("q", "a");

        when(javaQuestionService.getAll()).thenReturn(Set.of(question2));

        when(javaQuestionService.getSize()).thenReturn(1);

        assertEquals(javaQuestionService.getAll().size(), out.getQuestions(1).size());

    }
}
