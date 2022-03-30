package pro.sky.projectcourse2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.projectcourse2.exception.InvalidExamGenerateException;
import pro.sky.projectcourse2.model.Question;
import pro.sky.projectcourse2.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) throws InvalidExamGenerateException {
        return examinerService.getQuestions(amount);
    }
}
