package rjr.studio.biblioteca.service.type;

import java.util.List;

import rjr.studio.biblioteca.dao.entity.type.TypeEntity;

public interface TypeService<T extends TypeEntity, CODE> {
	
	public List<T> findAll();

}
