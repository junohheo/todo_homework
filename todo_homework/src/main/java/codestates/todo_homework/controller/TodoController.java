package codestates.todo_homework.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TodoController {
    @GetMapping("/")
    public String helloTodo() {
        return To_do Application
    }
}
