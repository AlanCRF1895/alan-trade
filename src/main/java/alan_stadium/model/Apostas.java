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
	private long idAposta;
	
	private String competicao;
	private String timeMandante;
	private String timeVisitante;
	private String estrategia;
	private String mercado;
	private BigDecimal stake;
	private BigDecimal profitLoss;
	private boolean golFavor;
	private boolean golContra;
	
	
	public long getIdAposta() {
		return idAposta;
	}
	public void setIdAposta(long idAposta) {
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
	public boolean isGolFavor() {
		return golFavor;
	}
	public void setGolFavor(boolean golFavor) {
		this.golFavor = golFavor;
	}
	public boolean isGolContra() {
		return golContra;
	}
	public void setGolContra(boolean golContra) {
		this.golContra = golContra;
	}
	
	
}
