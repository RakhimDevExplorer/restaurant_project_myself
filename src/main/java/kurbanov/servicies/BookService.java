package kurbanov.servicies;

import kurbanov.dto.requests.BookRequest;
import kurbanov.dto.responses.BookResponse;
import kurbanov.dto.responses.SimpleResponse;

import java.util.List;

/**
 * ~ @created 15/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public interface BookService {
    SimpleResponse addBook(BookRequest bookRequest);

    List<BookResponse> searchBooks(String keyword);

    BookResponse findById(Long bookId);

    SimpleResponse updateBook(Long bookId, BookRequest bookRequest);

    SimpleResponse borrowBook(Long userId, Long bookId);

    SimpleResponse returnBook(Long borrowedBook);


}
