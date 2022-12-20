package alan_stadium.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alan_stadium.model.Estrategias;
import alan_stadium.repository.EstrategiasRepository;

@Service
public class EstrategiasManager {

	@Autowired
	EstrategiasRepository estrategiasRepository;
	
	public Estrategias cadastrarEstrategias(Estrategias estrategias) {
		return estrategiasRepository.save(estrategias);
	}
	
	public List<Estrategias> listarEstrategiasTodos(){
		return estrategiasRepository.findAll();
	}
	
}
