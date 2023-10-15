package kurbanov.servicies.impl;

import kurbanov.dto.requests.BookRequest;
import kurbanov.dto.responses.BookResponse;
import kurbanov.dto.responses.SimpleResponse;
import kurbanov.exception.BadRequestException;
import kurbanov.repositories.BookRepository;
import kurbanov.repositories.BorrowedBookRepository;
import kurbanov.servicies.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ~ @created 15/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BorrowedBookRepository borrowedBookRepository;

    @Override
    public SimpleResponse addBook(BookRequest bookRequest) {
        final boolean exists = bookRepository.existsBookByTitleAndId(bookRequest.title(), bookRequest.build().getId());
        if (exists) throw new BadRequestException("Almost exists this books title ");
        bookRepository.save(bookRequest.build());
        
        return null;
    }

    @Override
    public List<BookResponse> searchBooks(String keyword) {
        return null;
    }

    @Override
    public BookResponse findById(Long bookId) {
        return null;
    }

    @Override
    public SimpleResponse updateBook(Long bookId, BookRequest bookRequest) {
        return null;
    }

    @Override
    public SimpleResponse borrowBook(Long userId, Long bookId) {
        return null;
    }

    @Override
    public SimpleResponse returnBook(Long borrowedBook) {
        return null;
    }
}
