package rjr.studio.biblioteca.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeChannelEntity;
import rjr.studio.biblioteca.service.type.TypeChannelService;

@RestController
@RequestMapping("/rjr/biblioteca/tipologiche")
public class TypeChannelController {
	
	@Autowired TypeChannelService typeChannelService;
	
	@GetMapping("/canali")
	List<TypeChannelEntity> findAll(){
		List<TypeChannelEntity> rtn = typeChannelService.findAll();
		return rtn;		
	}

}
