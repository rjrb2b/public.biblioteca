package rjr.studio.biblioteca.service.type;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.biblioteca.dao.entity.type.TypeChannelEntity;
import rjr.studio.biblioteca.dao.repository.type.TypeChannelRepository;


@Service
public class TypeChannelService {
	
	@Autowired TypeChannelRepository typeChannelRepository;
	
	public List<TypeChannelEntity> findAll() {
		List<TypeChannelEntity> rtn = typeChannelRepository.findAll();
		return rtn;
	}

}
