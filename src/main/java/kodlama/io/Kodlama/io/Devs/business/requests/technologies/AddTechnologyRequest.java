package kodlama.io.Kodlama.io.Devs.business.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddTechnologyRequest {

	private int languageId;
	private String name;
}
