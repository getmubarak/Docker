import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demoapp.entity.Todo;

public interface TodoRepository extends MongoRepository<Todo, String> {

    public Todo findByTitle(String title);
    public List<Todo> findByDesc(String title);

}
