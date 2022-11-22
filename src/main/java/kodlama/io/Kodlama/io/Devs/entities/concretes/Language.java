package kodlama.io.Kodlama.io.Devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="languages")
@AllArgsConstructor
@NoArgsConstructor
public class Language {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="language_id")
private int id;
@Column(name="language_name")
private String name;



}
