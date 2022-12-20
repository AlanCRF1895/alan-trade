package alan_stadium.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alan_stadium.model.Time;
import alan_stadium.repository.TimesRepository;

@Service
public class TimeManager {

	@Autowired
	private TimesRepository timesRepository;
	
	public Time cadastroTime(Time time) {
	
		return timesRepository.save(time);
	}
	
	public List<Time> consultarTimesTodos(){
		return timesRepository.findAll();
	}
	
	public Optional<Time> consultarTimesId(long id) {
		return timesRepository.findById(id);
	}
	
}
