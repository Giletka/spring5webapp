package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dmitry Moiseenko on 20.01.2019
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
