package net.fernandosimon.books.repositories;

import net.fernandosimon.books.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author developer
 * @date 2020-04-05
 * @time 23:10
 */

public interface BookRepository extends MongoRepository<Book, String> {

    public Book findByName(String name);
    public List<Book> findByAuthor(String author);

}
