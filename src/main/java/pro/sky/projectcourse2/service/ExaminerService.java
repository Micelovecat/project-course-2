package pro.sky.projectcourse2.service;

import pro.sky.projectcourse2.exception.InvalidExamGenerateException;
import pro.sky.projectcourse2.model.Question;

import java.util.ArrayList;
import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount) throws InvalidExamGenerateException;

    ArrayList findAllQuestions();
}
