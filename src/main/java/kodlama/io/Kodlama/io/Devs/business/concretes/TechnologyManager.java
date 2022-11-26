package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.technologies.AddTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologies.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologies.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.TechnologyResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.LanguageTechnology;

public class TechnologyManager implements TechnologyService{

	private TechnologyRepository technologyRepository;
	private LanguageTechnology languageTechnology;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, LanguageTechnology languageTechnology) {
		super();
		this.technologyRepository = technologyRepository;
		this.languageTechnology = languageTechnology;
	}

	@Override
	public List<TechnologyResponse> getAll() {
		List<LanguageTechnology> technologies = technologyRepository.findAll();
		List<TechnologyResponse> technologyResponses= new ArrayList<TechnologyResponse>();
		
		for (LanguageTechnology languageTechnology : technologies) {
			TechnologyResponse technologyResponse= new TechnologyResponse();
			technologyResponse.setId(languageTechnology.getId());
			technologyResponse.setName(languageTechnology.getTechnologyName());
			technologyResponses.add(technologyResponse);
		}
		return technologyResponses;
	}

	@Override
	public void add(AddTechnologyRequest addTechnologyRequest) throws Exception {
		addTechnologyRequest.setLanguageId(languageTechnology.getId());
		addTechnologyRequest.setName(languageTechnology.getTechnologyName());
		
		if(languageTechnology.getTechnologyName()==null||addTechnologyRequest.getName().isEmpty()) {
			
			throw new Exception ("this area cannot be blank");
		}
		
		else {
			technologyRepository.save(languageTechnology);
			throw new Exception("technology information is added.");	
		}
		
		
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		deleteTechnologyRequest.setId(languageTechnology.getId());
		
		if(languageTechnology.getTechnologyName()==null) {
			
			throw new Exception ("this area cannot be blank");
		}
		
		else {
			technologyRepository.save(languageTechnology);
			throw new Exception("technology information is added.");	
		}
		
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		
		updateTechnologyRequest.setName(languageTechnology.getTechnologyName());
		
		if(languageTechnology.getTechnologyName()==null||updateTechnologyRequest.getName().isEmpty()) {
			
			throw new Exception ("this area cannot be blank");
		}
		
		else {
			technologyRepository.save(languageTechnology);
			throw new Exception("technology information is added.");	
		}
		
	}
	
	
	
	
}
