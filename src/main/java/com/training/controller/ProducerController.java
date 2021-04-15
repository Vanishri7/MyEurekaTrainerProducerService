package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Producer;
import com.training.interfaces.ProducerServiceI;

@Configuration
@RestController
@RequestMapping("/producer/api")
public class ProducerController {

	

	@Autowired
	private ProducerServiceI producerService;
	
	@GetMapping("/getallproducers")
	public List<Producer> getProducers()
	{
		return producerService.findAll();
	}
	
	
	@PostMapping("/addproducer")
	public Producer addProducer(@RequestBody Producer producer)
	{
		return producerService.addProducer(producer);
	}
	
	//localhost:8097/producer/api/deleteProducer/trainercode/TR001
	@DeleteMapping("/deleteProducer/trainercode/{trainercode}") 
	public boolean deleteProducer(@PathVariable("trainercode") String trainercode)
	{
		return producerService.deleteById(trainercode);
	}
	
	//localhost:8097/producer/api/updateMobileno/trainercode/TR001/newmobileNo/1234567899
	@GetMapping("/updateMobileno/trainercode/{trainercode}/newmobileNo/{newmobileNo}") 
	public Producer updateMobileno(@PathVariable("trainercode") String trainercode,@PathVariable("newmobileNo") long newmobileNo)
	{
		return producerService.updateMobileno(trainercode,newmobileNo);
	}
	
	@GetMapping("/getProducer/trainercode/{trainercode}")
	public Producer getProducer(@PathVariable("trainercode") String trainercode)
	{
		Producer producer= producerService.getProducer(trainercode);
		//producer.setPort(port);
		return producer;
	}
	
	
	/*
	 * @GetMapping("/getProducerPattern/{pattern}") public List<Producer>
	 * getProducerPattern(@PathVariable("pattern") String pattern) { return
	 * producerService.getProducerPattern(pattern);
	 * 
	 * }
	 */
	
}
