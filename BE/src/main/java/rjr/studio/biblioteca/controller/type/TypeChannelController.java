package rjr.studio.biblioteca.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeChannelEntity;
import rjr.studio.biblioteca.service.type.TypeService;

@RestController
public class TypeChannelController implements TypeController<TypeChannelEntity> {
	
	@Autowired TypeService<TypeChannelEntity, String> service;

	@Override
	@GetMapping("/canali")
	public List<TypeChannelEntity> findAll() {

		List<TypeChannelEntity> rtn = service.findAll();
		
		return rtn;		
	}

}
