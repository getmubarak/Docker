
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {

    public Todo findByTitle(String title);

}
