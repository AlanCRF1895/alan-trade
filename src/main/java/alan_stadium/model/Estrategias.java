package alan_stadium.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estrategias {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long idEstrategia;
	private String nomeEstrategia;
	
	public long getIdEstrategia() {
		return idEstrategia;
	}
	public void setIdEstrategia(long idEstrategia) {
		this.idEstrategia = idEstrategia;
	}
	public String getNomeEstrategia() {
		return nomeEstrategia;
	}
	public void setNomeEstrategia(String nomeEstrategia) {
		this.nomeEstrategia = nomeEstrategia;
	}
	
}
