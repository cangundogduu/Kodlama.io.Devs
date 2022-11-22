package kodlama.io.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.technologies.AddTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologies.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologies.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.TechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public List<TechnologyResponse> getall(){
		return technologyService.getAll();
	};
	@PostMapping("/add")
	public void add(AddTechnologyRequest addTechnologyRequest)throws Exception {
		this.technologyService.add(addTechnologyRequest);
	}

	
	@DeleteMapping("/delete")
	public void delete(DeleteTechnologyRequest deleteLanguageRequest) throws Exception{
		this.technologyService.delete(deleteLanguageRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception{
		this.technologyService.update(updateTechnologyRequest);
	
	}
	
}
