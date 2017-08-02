import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="todo")
public class Todo {

    @Id
    public String id;
    public String title;

    public Todo() {}

    public void setTitle(String title){
    	this.title = title;
    }
    public String getTitle(){
    	return title;
    }
}
