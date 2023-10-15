package kurbanov.repositories;

import kurbanov.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ~ @created 15/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsBookByTitleAndId(String title, Long id);

}
