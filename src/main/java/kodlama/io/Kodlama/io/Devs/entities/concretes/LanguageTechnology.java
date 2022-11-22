package kodlama.io.Kodlama.io.Devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name= "technologies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LanguageTechnology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "technology_id")
	private int id;
	
	@Column(name= "name")
	private String technologyName;
	
	@ManyToOne
	@JoinColumn(name="language_id")
	public Language language;
	
	
	
	
}
