package alan_stadium.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apostas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAposta;
	
	private String competicao;
	private String timeMandante;
	private String timeVisitante;
	private String estrategia;
	private String mercado;
	private BigDecimal stake;
	private BigDecimal profitLoss;
	private Boolean golFavor;
	private Boolean golContra;
	private String esporte;
	
	
	
	public Long getIdAposta() {
		return idAposta;
	}
	public void setIdAposta(Long idAposta) {
		this.idAposta = idAposta;
	}
	public String getCompeticao() {
		return competicao;
	}
	public void setCompeticao(String competicao) {
		this.competicao = competicao;
	}
	public String getTimeMandante() {
		return timeMandante;
	}
	public void setTimeMandante(String timeMandante) {
		this.timeMandante = timeMandante;
	}
	public String getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public String getEstrategia() {
		return estrategia;
	}
	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}
	public String getMercado() {
		return mercado;
	}
	public void setMercado(String mercado) {
		this.mercado = mercado;
	}
	public BigDecimal getStake() {
		return stake;
	}
	public void setStake(BigDecimal stake) {
		this.stake = stake;
	}
	public BigDecimal getProfitLoss() {
		return profitLoss;
	}
	public void setProfitLoss(BigDecimal profitLoss) {
		this.profitLoss = profitLoss;
	}

	public Boolean getGolFavor() {
		return golFavor;
	}
	public void setGolFavor(Boolean golFavor) {
		this.golFavor = golFavor;
	}
	public Boolean getGolContra() {
		return golContra;
	}
	public void setGolContra(Boolean golContra) {
		this.golContra = golContra;
	}
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	
	
}
