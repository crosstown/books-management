package net.fernandosimon.books.bootstrap;

import net.fernandosimon.books.domain.Book;
import net.fernandosimon.books.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @author developer
 * @date 2020-04-05
 * @time 00:34
 */

@Component
public class ApplicationBootstrap implements CommandLineRunner {

    private BookRepository bookRepository;

    public ApplicationBootstrap(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Application started ...");

        bookRepository.save(new Book("AA123", "Misterio de las valijas verdes", 120, "Raul Scanio"));
        bookRepository.save(new Book("AA200", "No mames cabron", 80, "Duilio Garav"));
        bookRepository.save(new Book("AB100", "Quien me engano", 280, "Carlos Torre"));

        // fetch all books

        System.out.println("Books found with findByName('Misterio de las valijas verdes'");
        System.out.println("------------------------------------------------------------");
        System.out.println(bookRepository.findByName("Misterio de las valijas verdes"));


    }
}
