package zw.co.abn.generic.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.co.abn.generic.model.Student;
import zw.co.abn.generic.resource.generic.GenericResource;
import zw.co.abn.generic.service.generic.GenericService;

@RequestMapping("/api/v1/student")
@RestController
public class StudentResource extends GenericResource<Student,String> {
    public StudentResource(GenericService<Student, String> service) {
        super(service);
    }
}
