package rjr.studio.biblioteca.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeSupportEntity;
import rjr.studio.biblioteca.service.type.TypeService;

@RestController
public class TypeSupportController implements TypeController<TypeSupportEntity>{
	
	@Autowired TypeService<TypeSupportEntity, String> service;
	
	@Override
	@GetMapping("/supporti")
	public List<TypeSupportEntity> findAll(){
		List<TypeSupportEntity> rtn = service.findAll();
		return rtn;		
	}

}
