package rjr.studio.biblioteca.api.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeGenreEntity;
import rjr.studio.biblioteca.service.type.TypeGenreService;

@RestController
@CrossOrigin
public class TypeGenreController implements TypeController<TypeGenreEntity>{
    
	@Autowired private TypeGenreService service;
   
    @GetMapping("/generi")
    public List<TypeGenreEntity> findAll(){
        return service.findAll();
    }

}