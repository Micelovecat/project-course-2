package pro.sky.projectcourse2.service;

import pro.sky.projectcourse2.model.Question;

import java.util.Collection;

public interface QuestionService {

    boolean add(String question, String answer);

    boolean remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

    int getSize();

}
