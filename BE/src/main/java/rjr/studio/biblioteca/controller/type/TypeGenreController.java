package rjr.studio.biblioteca.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeGenreEntity;
import rjr.studio.biblioteca.service.type.TypeService;

@RestController
public class TypeGenreController implements TypeController<TypeGenreEntity> {
	
	@Autowired TypeService<TypeGenreEntity, String> service;
	
	@Override
	@GetMapping("/generi")
	public List<TypeGenreEntity> findAll() {
		
		List<TypeGenreEntity> rtn = service.findAll();
		
		return rtn;		
	}

}
