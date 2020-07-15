package com.zd.springbootwithvuedemo1.repository;

import com.zd.springbootwithvuedemo1.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ProjectName: springbootwithvuedemo1
 * @Package: com.zd.springbootwithvuedemo1.repository
 * @ClassName: BookRepository
 * @Author: 晴天
 * @Date: 2020/7/13 14:35
 * @Version: 1.0
 */
public interface BookRepository extends JpaRepository<Book,Integer>{
}
