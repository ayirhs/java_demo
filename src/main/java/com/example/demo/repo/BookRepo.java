package com.example.demo.repo;





import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookRepo extends
        JpaRepository<Book,Integer> {


}