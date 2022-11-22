package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.languages.AddLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.LanguageResponse;

public interface LanguageService {
	
	List<LanguageResponse> getall();
	void update(UpdateLanguageRequest updateLanguageRequest) throws Exception;
	void add(AddLanguageRequest addLanguageRequest) throws Exception;
	void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception;
	
	
}
