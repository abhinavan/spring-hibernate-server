package com.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;


import com.pojos.Training;
import com.pojos.User;

@Configuration
@Repository
public interface TrainingDao 
{
	public String registerTraining(Training training);
	
}
