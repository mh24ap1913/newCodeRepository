package com.vikas.repository;
import org.springframework.data.repository.CrudRepository;

import com.vikas.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
