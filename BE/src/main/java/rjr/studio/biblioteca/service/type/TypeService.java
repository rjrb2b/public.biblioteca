package rjr.studio.biblioteca.service.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import rjr.studio.biblioteca.dao.repository.type.TypeRepository;

public abstract class TypeService<E, T> {
	
	@Autowired TypeRepository<E, T> repo;
		
	public List<E> findAll() {
		
		List<E> rtn = repo.findAll();
		
		return rtn;
	}

}
