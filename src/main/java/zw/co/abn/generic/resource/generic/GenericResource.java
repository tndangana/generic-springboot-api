package zw.co.abn.generic.resource.generic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import zw.co.abn.generic.model.Base;
import zw.co.abn.generic.service.generic.GenericService;

import java.util.List;
import java.util.Optional;

public class GenericResource<T extends Base,ID extends String>  implements IGenericResource<T,ID>{

    private GenericService<T,ID> service;

    public GenericResource(GenericService<T, ID> service) {
        this.service = service;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<T> create(@RequestBody @Validated T t) {
        try {
            service.save(t);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<T>> getAll() {
        try{
            Optional<List<T>> list = service.findAll();
            if(list.isPresent()){
                return new ResponseEntity<>(list.get(), HttpStatus.OK);
            }
            else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<T> deleteById( @PathVariable("id") ID id) {
        try {
            Optional<T> optionalT = Optional.of(service.findById(id).get());
            optionalT.ifPresent(t1 -> service.deleteById((ID) t1.getId()));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<T> update(T t) {
        return null;
    }


    @Override
    @GetMapping("/{id}")
    public ResponseEntity<T> find(@PathVariable("id") ID id) {
        try{
            Optional<T> t = service.findById(id);
            if(t.isPresent()){
                return new ResponseEntity<>(t.get(), HttpStatus.OK);
            }
            else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
