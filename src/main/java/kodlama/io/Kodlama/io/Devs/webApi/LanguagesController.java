package kodlama.io.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getall(){
		return languageService.getall();
	};
	@GetMapping("/add")
	public List<Language> add() throws Exception{
		return languageService.add();
	}
	@GetMapping("/delete")
	public List<Language> delete() throws Exception{
		return languageService.delete();
	}
	@GetMapping("/update")
	public List<Language> update() throws Exception{
		return languageService.update();
	}
	
	
	
	
}
