package zw.co.abn.generic.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "student")
public class Student extends Base{
    private String firstName;
    private String lastName;
    private Integer age;

}
