package rjr.studio.biblioteca.service.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.biblioteca.dao.entity.type.TypeSupportEntity;
import rjr.studio.biblioteca.dao.repository.type.TypeSupportRepository;

@Service
public class TypeSupportService {
	
	@Autowired TypeSupportRepository typeSupportRepository;
	
	public List<TypeSupportEntity> findAll() {
		List<TypeSupportEntity> rtn = typeSupportRepository.findAll();
		return rtn;
	}

}
