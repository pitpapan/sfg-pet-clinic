package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {

    //all our service interfaces are going to inherit these methods
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
