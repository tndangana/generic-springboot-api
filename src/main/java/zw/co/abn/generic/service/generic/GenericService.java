package zw.co.abn.generic.service.generic;

import zw.co.abn.generic.model.Base;
import zw.co.abn.generic.repository.GenericRepository;
import zw.co.abn.generic.service.IGenericService;

import java.util.List;
import java.util.Optional;

public class GenericService<T extends Base,ID extends String> implements IGenericService<T,ID> {

    private GenericRepository<T> genericRepository;

    public GenericService(GenericRepository<T> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public void save(T t) {
      genericRepository.save(t);
    }

    @Override
    public void deleteById(ID s) {
     genericRepository.deleteById(s);
    }

    @Override
    public Optional<T> findById(ID s) {
        return Optional.ofNullable(genericRepository.findById(s).get());
    }

    @Override
    public Optional<List<T>> findAll() {
        return Optional.ofNullable(genericRepository.findAll());
    }

    @Override
    public void update(T t, ID s) {

    }
}
