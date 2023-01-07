package rjr.studio.biblioteca.dao.entity.type;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class TypeEntity{
	
    @Id
    @Column(name = "CODICE", length = 5, nullable = false)
    private String code;
    @Column(name = "NOME", length = 25, nullable = false)
    private String name;
    @Column(name = "DESCRIZIONE", length = 255, nullable = false)
    private String description;
    
    // getters & setters
    
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
