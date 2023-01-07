package rjr.studio.biblioteca.service.type;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import rjr.studio.biblioteca.dao.entity.type.TypeSupportEntity;
import rjr.studio.biblioteca.dao.repository.type.TypeSupportRepository;

@Service
@Transactional
public class TypeSupportServiceImpl extends TypeServiceImpl<TypeSupportEntity, String> implements TypeSupportService {
	
	private TypeSupportRepository repo;

	public TypeSupportServiceImpl(TypeSupportRepository repo) {
		super(repo);
	}

}
