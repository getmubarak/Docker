
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="todo")
public class Todo {

    @Id
    public String id;

    public String title;
    public String desc;
    public Date date;

    public Todo() {}

    public void setTitle(String title){
    	this.title = title;
    }
    public String getTitle(){
    	return title;
    }
    public void setDesc(String desc){
    	this.desc = desc;
    }
    public String getDesc(){
    	return desc;
    }
    public void setDate(Date date){
    	this.date= date;
    }
    public Date getDate(){
    	return date;
    }
    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, title='%s', desc='%s']",
                id, title, desc);
    }

}
