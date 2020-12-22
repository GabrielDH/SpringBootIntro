package com.tts.SpringBootIntro.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.SpringBootIntro.domain.feedback;
import com.tts.h2Explore.domain.Customer;

public class feedbackRepository extends CrudRepository<Customer,Long>{
	List<feedback> findByLastName(String lastName);
}
