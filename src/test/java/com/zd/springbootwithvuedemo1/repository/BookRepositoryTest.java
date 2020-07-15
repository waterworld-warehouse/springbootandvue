package com.zd.springbootwithvuedemo1.repository;

import com.zd.springbootwithvuedemo1.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ProjectName: springbootwithvuedemo1
 * @Package: com.zd.springbootwithvuedemo1.repository
 * @ClassName: BookRepositoryTest
 * @Author: 晴天
 * @Date: 2020/7/13 14:37
 * @Version: 1.0
 */
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());
    }

    @Test
    void addBook(){
        Book book = new Book();
        book.setName("Spring Cloud2");
        book.setAuthor("世界2！");
        bookRepository.save(book);
    }

    @Test
    void findById(){
        Book result = bookRepository.findById(1).get();
        System.out.println(result);
    }

    @Test
    void update(){
        Book result = new Book();
        result.setId(26);
        result.setAuthor("test");
        bookRepository.save(result);
    }

    @Test
    void deleteById(){
        bookRepository.deleteById(26);
    }


}
