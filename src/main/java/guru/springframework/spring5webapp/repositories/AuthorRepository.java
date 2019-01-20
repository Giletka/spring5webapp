package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dmitry Moiseenko on 20.01.2019
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
