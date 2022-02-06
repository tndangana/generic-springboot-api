package zw.co.abn.generic.service;

import org.springframework.stereotype.Service;
import zw.co.abn.generic.model.Student;
import zw.co.abn.generic.repository.GenericRepository;
import zw.co.abn.generic.service.generic.GenericService;

@Service
public class StudentService extends GenericService<Student,String> {
    public StudentService(GenericRepository<Student> genericRepository) {
        super(genericRepository);
    }
}
