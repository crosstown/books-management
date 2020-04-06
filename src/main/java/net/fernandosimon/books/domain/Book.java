package net.fernandosimon.books.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author developer
 * @date 2020-04-05
 * @time 00:02
 */
@Data
@AllArgsConstructor
@Document
public class Book {

    @Id
    private String id;
    @TextIndexed
    private String name;
    private int nPages;
    private String author;


}
