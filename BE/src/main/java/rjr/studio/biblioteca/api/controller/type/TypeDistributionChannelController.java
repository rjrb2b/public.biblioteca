package rjr.studio.biblioteca.api.controller.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.biblioteca.dao.entity.type.TypeDistributionChannelEntity;
import rjr.studio.biblioteca.service.type.TypeDistributionChannelService;

@RestController
@CrossOrigin
public class TypeDistributionChannelController implements TypeController<TypeDistributionChannelEntity>{
    
	@Autowired private TypeDistributionChannelService service;
   
    @GetMapping("/canaliDistribuzione")
    public List<TypeDistributionChannelEntity> findAll(){
        return service.findAll();
    }

}