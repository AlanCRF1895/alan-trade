package alan_stadium.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Jogos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_jogo")
	private long idJogo;
	@Column(name = "time_mandante")
	private String timeMandante;
	@Column(name = "time_visitante")
	private String timeVisitante;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data")
	private LocalDate data;
	@Column(name = "hora")
	private String hora;
	@Column(name = "competicao")
	private String competicao;
	
	public long getIdJogo() {
		return idJogo;
	}
	public void setIdJogo(long idJogo) {
		this.idJogo = idJogo;
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
	public String getCompeticao() {
		return competicao;
	}
	public void setCompeticao(String competicao) {
		this.competicao = competicao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	
	
	
}
