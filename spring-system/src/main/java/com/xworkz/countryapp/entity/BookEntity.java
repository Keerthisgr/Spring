package com.xworkz.countryapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_information")
@NamedQuery(name = "getByName",query = "select book from BookEntity book where book.bookName=:bookName")
@NamedQuery(name = "updateByName",query = "update BookEntity book set book.authorName=:authorName where book.bookName=:bookName")
//@NamedQuery(name = "getAllData",query = "select book from BookEntity book")
@NamedQuery(name = "getAllData", query = "SELECT book FROM BookEntity book")
@NamedQuery(name = "deleteById",query = "delete from BookEntity book where book.id=:id")
@NamedQuery(name = "updateBookAndAuthorNameById",query = "update BookEntity book set book.authorName=:authorName, book.bookName=:bookName where book.id=:id")
@NamedQuery(name = "getByAuthorName",query = "select book from BookEntity book where book.authorName=:authorName")



public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "author_name")
    private String authorName;
    private Double price;
}
