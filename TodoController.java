

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

	 @Autowired
	 public TodoRepository todoRepository;
	 
	 @RequestMapping("/create")
	 public String create(Todo todo) {
	  todo = todoRepository.save(todo);
	  return "Todo created successfully";
	 }
	 
	@RequestMapping("/all")
	 public List<Todo> readAll() {
	  return todoRepository.findAll();
	}
}
