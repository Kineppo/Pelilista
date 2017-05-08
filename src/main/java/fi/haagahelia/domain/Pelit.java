package fi.haagahelia.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pelit {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nimi;
	private String alusta;
	private String julkaisu;
	
	public Pelit() {
		super();
	}

	public Pelit(String nimi, String alusta, String julkaisu) {
		super();
		this.nimi = nimi;
		this.alusta = alusta;
		this.julkaisu = julkaisu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getAlusta() {
		return alusta;
	}

	public void setAlusta(String alusta) {
		this.alusta = alusta;
	}

	public String getJulkaisu() {
		return julkaisu;
	}

	public void setJulkaisu(String julkaisu) {
		this.julkaisu = julkaisu;
	}

	@Override
	public String toString() {
		return "Pelit [id=" + id + ", nimi=" + nimi + ", alusta=" + alusta + ", julkaisu=" + julkaisu + "]";
	}
	
}
