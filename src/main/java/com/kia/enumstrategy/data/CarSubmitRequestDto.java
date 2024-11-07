package com.kia.enumstrategy.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarSubmitRequestDto {
    private String name ;
    private CarColor color;
    private CarGrade grade;
}
