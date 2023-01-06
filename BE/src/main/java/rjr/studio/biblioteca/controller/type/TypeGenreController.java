package rjr.studio.biblioteca.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeGenreEntity;
import rjr.studio.biblioteca.service.type.TypeGenreService;

@RestController
@RequestMapping("/rjr/biblioteca/tipologiche")
public class TypeGenreController {
	
	@Autowired TypeGenreService typeGenreService;
	
	@GetMapping("/generi")
	List<TypeGenreEntity> findAll(){
		List<TypeGenreEntity> rtn = typeGenreService.findAll();
		return rtn;		
	}

}
