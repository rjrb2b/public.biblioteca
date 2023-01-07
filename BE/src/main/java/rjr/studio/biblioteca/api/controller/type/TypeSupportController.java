package rjr.studio.biblioteca.api.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeSupportEntity;
import rjr.studio.biblioteca.service.type.TypeSupportService;

@RestController
@CrossOrigin
public class TypeSupportController implements TypeController<TypeSupportEntity>{
    
	@Autowired private TypeSupportService service;
   
    @GetMapping("/supporti")
    public List<TypeSupportEntity> findAll(){
        return service.findAll();
    }

}