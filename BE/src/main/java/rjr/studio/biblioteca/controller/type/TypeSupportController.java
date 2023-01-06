package rjr.studio.biblioteca.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeSupportEntity;
import rjr.studio.biblioteca.service.type.TypeSupportService;

@RestController
@RequestMapping("/biblioteca/tipologiche")
public class TypeSupportController {
	
	@Autowired TypeSupportService service;
	
	@GetMapping("/generi")
	public List<TypeSupportEntity> findAll() {
		
		List<TypeSupportEntity> rtn = service.findAll();
		
		return rtn;		
	}

}
