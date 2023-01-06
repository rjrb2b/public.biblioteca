package rjr.studio.biblioteca.service.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.biblioteca.dao.entity.type.TypeGenreEntity;
import rjr.studio.biblioteca.dao.repository.type.TypeGenreRepository;

@Service
public class TypeGenreService {
	
	@Autowired TypeGenreRepository typeGenreRepository;
	
	public List<TypeGenreEntity> findAll() {
		List<TypeGenreEntity> rtn = typeGenreRepository.findAll();
		return rtn;
	}

}
