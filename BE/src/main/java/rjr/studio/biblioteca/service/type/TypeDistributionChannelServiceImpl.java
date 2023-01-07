package rjr.studio.biblioteca.service.type;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import rjr.studio.biblioteca.dao.entity.type.TypeDistributionChannelEntity;
import rjr.studio.biblioteca.dao.repository.type.TypeDistributionChannelRepository;

@Service
@Transactional
public class TypeDistributionChannelServiceImpl extends TypeServiceImpl<TypeDistributionChannelEntity, String> implements TypeDistributionChannelService {
	
	private TypeDistributionChannelRepository repo;

	public TypeDistributionChannelServiceImpl(TypeDistributionChannelRepository repo) {
		super(repo);
	}

}
