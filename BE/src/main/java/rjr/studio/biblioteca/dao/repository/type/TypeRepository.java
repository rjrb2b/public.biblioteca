package rjr.studio.biblioteca.dao.repository.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository<E, T> extends JpaRepository<E, T> {

}
