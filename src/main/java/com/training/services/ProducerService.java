package com.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Producer;
import com.training.interfaces.ProducerServiceI;
import com.training.repo.ProducerRepo;

@Service
public class ProducerService implements ProducerServiceI{

	@Autowired
	private ProducerRepo producerRepo;
	
	@Override
	public List<Producer> findAll() {
		return producerRepo.findAll();
		
	}

	@Override
	public Producer addProducer(Producer producer) {
		return producerRepo.save(producer);
	}

	@Override
	public boolean deleteById(String trainercode) {
		Producer producer = producerRepo.findById(trainercode).get();
		if(producer!=null)	{
			producerRepo.delete(producer);return true;}
		
		return false;
	}

	@Override
	public Producer updateMobileno(String trainercode, long newmobileNo) {
		Producer producer = producerRepo.findById(trainercode).get();
		producer.setMobileNo(newmobileNo);
		producerRepo.save(producer);
		return producer;
	}

	@Override
	public Producer getProducer(String trainercode) {
		return producerRepo.findById(trainercode).get();
	}

	/*
	 * @Override public List<Producer> getProducerPattern(String pattern) { return
	 * producerRepo.findBySkillsetLike(pattern); }
	 */

	
	
}
