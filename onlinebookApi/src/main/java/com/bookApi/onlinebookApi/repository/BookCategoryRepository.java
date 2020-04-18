package com.bookApi.onlinebookApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bookApi.onlinebookApi.entity.BookCategory;


/*@RepositoryRestResource(collectionResourceRel="bookCateogry", path="book-category")*/
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
