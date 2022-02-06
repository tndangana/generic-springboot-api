package zw.co.abn.generic.resource.generic;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IGenericResource<T,ID extends String> {

    ResponseEntity<T> create(T t);
    ResponseEntity<List<T>> getAll();
    ResponseEntity<T> deleteById(ID id);
    ResponseEntity<T> update(T t);
    ResponseEntity<T> find(ID id);
}
