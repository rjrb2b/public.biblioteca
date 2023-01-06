package rjr.studio.biblioteca.dao.repository.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rjr.studio.biblioteca.dao.entity.type.TypeChannelEntity;

@Repository
public interface TypeChannelRepository extends JpaRepository<TypeChannelEntity, String> {

}
