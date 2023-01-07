package rjr.studio.biblioteca.controller.type;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/biblio/tipologiche")
public interface TypeController<T> {
	
	 public List<T> findAll();

}
