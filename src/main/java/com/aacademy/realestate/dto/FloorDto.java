package com.aacademy.realestate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FloorDto {

    private Long id;

    @Range(min = -3, max = 164, message = "Floors should be between -3 and 164")
    private Integer number;
}
