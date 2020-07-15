package com.zd.springbootwithvuedemo1.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ProjectName: springbootwithvuedemo1
 * @Package: com.zd.springbootwithvuedemo1.entity
 * @ClassName: Book
 * @Author: 晴天
 * @Date: 2020/7/13 14:26
 * @Version: 1.0
 */

@Entity
@Data
public class Book{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;

}
