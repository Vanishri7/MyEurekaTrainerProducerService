package com.training.interfaces;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.training.bean.Producer;


public interface ProducerServiceI {

	List<Producer> findAll();
	Producer addProducer(Producer producer);
	boolean deleteById(String trainercode);
	Producer updateMobileno(String trainercode,long newmobileNo);
	Producer getProducer(String trainercode);
	//List<Producer> getProducerPattern(@PathVariable("pattern") String pattern);
}
