package com.example.adminservice.service;

import com.example.adminservice.Dao.TrainRepository;
import com.example.adminservice.entity.TrainDetails;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {

    @Autowired
    private TrainRepository trainRepository;

    @Transactional
    public void updateTrainDetails(TrainDetails trainDetails,String TrainName){
        TrainDetails trainDetails1=trainRepository.findTrainDetailsByTrainName(TrainName);
trainDetails1.setTrainName(trainDetails.trainName);
trainDetails1.setTrainNumber(trainDetails.TrainNumber);
trainDetails1.setSource(trainDetails.getSource());
trainDetails1.setDest(trainDetails1.getDest());
    }
}
