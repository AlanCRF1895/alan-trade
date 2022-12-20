package alan_stadium.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long idTime;
	
	private String nomeTime;
	private String caracteristicaTime;
	
	public long getIdTime() {
		return idTime;
	}
	public void setIdTime(long idTime) {
		this.idTime = idTime;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public String getCaracteristicaTime() {
		return caracteristicaTime;
	}
	public void setCaracteristicaTime(String caracteristicaTime) {
		this.caracteristicaTime = caracteristicaTime;
	}

	
}
