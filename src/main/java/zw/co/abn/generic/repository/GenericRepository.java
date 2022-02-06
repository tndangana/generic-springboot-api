package zw.co.abn.generic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zw.co.abn.generic.model.Base;

public interface GenericRepository<T extends Base> extends MongoRepository<T,String> {
}
