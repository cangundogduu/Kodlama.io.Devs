package kodlama.io.Kodlama.io.Devs.business.requests.languages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteLanguageRequest {

	private int id;
	private String name;
}
