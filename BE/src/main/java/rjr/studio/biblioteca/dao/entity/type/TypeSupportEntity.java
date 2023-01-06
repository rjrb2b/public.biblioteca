package rjr.studio.biblioteca.dao.entity.type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_SUPPORTO")
public class TypeSupportEntity {
	
	@Id
	@Column(name = "CODICE")
	private String code;
	@Column(name = "NOME")
	private String name;
	@Column(name = "DESCRIZIONE")
	private String description;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	

}
