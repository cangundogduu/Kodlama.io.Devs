package kodlama.io.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.languages.AddLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.LanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<LanguageResponse> getall(){
		return languageService.getall();
	};
	@PostMapping("/add")
	public void add(AddLanguageRequest addLanguageRequest)throws Exception {
		this.languageService.add(addLanguageRequest);
	}

	
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception{
		this.languageService.delete(deleteLanguageRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateLanguageRequest languageRequest) throws Exception{
		this.languageService.update(languageRequest);
	
	}
		
}
	
	
