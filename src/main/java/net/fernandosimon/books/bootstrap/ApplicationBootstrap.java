package net.fernandosimon.books.bootstrap;

import net.fernandosimon.books.domain.Book;
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

    private MongoTemplate mongoTemplate;

    public ApplicationBootstrap(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {

        Book emptyBook = new Book();
        this.mongoTemplate.save(emptyBook);

        System.out.println("Application started ...");

    }
}
