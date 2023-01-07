package rjr.studio.biblioteca.api.controller.type;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/biblio/tipologiche")
public interface TypeController<T> {
	
	 public List<T> findAll();

}
