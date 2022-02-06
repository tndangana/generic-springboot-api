package zw.co.abn.generic.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T,ID> {

    void save(T t);
    void deleteById(ID id);
    Optional<T> findById(ID id);
    Optional<List<T>> findAll();
    void update(T t,ID id);
}
