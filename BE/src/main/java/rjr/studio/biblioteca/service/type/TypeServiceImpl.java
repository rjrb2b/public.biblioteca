package rjr.studio.biblioteca.service.type;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.biblioteca.dao.entity.type.TypeEntity;
import rjr.studio.biblioteca.dao.repository.type.TypeRepository;

@Service
@Transactional
public abstract class TypeServiceImpl<T extends TypeEntity, CODE> implements TypeService<T, CODE>{

	private TypeRepository<T, CODE> repo;

	@Autowired
	public TypeServiceImpl(TypeRepository<T, CODE> repo) {
		this.repo = repo;
	}

	public List<T> findAll() {
		return repo.findAll();
	}

}