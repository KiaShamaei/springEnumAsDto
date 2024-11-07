package com.kia.enumstrategy.service;

import com.kia.enumstrategy.data.CarSubmitRequestDto;
import com.kia.enumstrategy.data.CarSubmitResponseDto;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    public String carRequestSubmit(CarSubmitRequestDto carDto){
        return "Dear "+carDto.getName() + " : you are submitting : "
                +" model " + carDto.getGrade().carSelectedGrad()
                + "Color "+carDto.getColor().selectedColor();
    }
}
