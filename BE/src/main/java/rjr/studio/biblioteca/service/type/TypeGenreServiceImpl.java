package rjr.studio.biblioteca.service.type;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import rjr.studio.biblioteca.dao.entity.type.TypeGenreEntity;
import rjr.studio.biblioteca.dao.repository.type.TypeGenreRepository;

@Service
@Transactional
public class TypeGenreServiceImpl extends TypeServiceImpl<TypeGenreEntity, String> implements TypeGenreService {
	
	private TypeGenreRepository repo;

	public TypeGenreServiceImpl(TypeGenreRepository repo) {
		super(repo);
	}

}
