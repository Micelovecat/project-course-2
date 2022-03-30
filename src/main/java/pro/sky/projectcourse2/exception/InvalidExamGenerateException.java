package pro.sky.projectcourse2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidExamGenerateException extends Throwable {
    public InvalidExamGenerateException(int amount, int currentSize) {
        super(String.format("Failed to generate %d questions, the current size is %d", amount, currentSize));
    }
}
