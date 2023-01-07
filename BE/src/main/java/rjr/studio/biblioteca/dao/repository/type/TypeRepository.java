package rjr.studio.biblioteca.dao.repository.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import rjr.studio.biblioteca.dao.entity.type.TypeEntity;

@NoRepositoryBean
public interface TypeRepository<T extends TypeEntity, CODE> extends JpaRepository<T, CODE>{
    
}
