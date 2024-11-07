package com.kia.enumstrategy.controller;


import com.kia.enumstrategy.data.CarSubmitRequestDto;
import com.kia.enumstrategy.data.CarSubmitResponseDto;
import com.kia.enumstrategy.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
public class CarController {
    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<String> get(){

        return ResponseEntity.ok("Hello World ...");
    }
    @PostMapping("/")
    public  ResponseEntity<CarSubmitResponseDto> submit(@RequestBody CarSubmitRequestDto carSubmitRequestDto){
        CarSubmitResponseDto responseDto = new CarSubmitResponseDto();
        String result = service.carRequestSubmit(carSubmitRequestDto);
        responseDto.setSubmitForm(result);
        return ResponseEntity.ok(responseDto);
    }
}
