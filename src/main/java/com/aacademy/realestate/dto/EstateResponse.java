package com.aacademy.realestate.dto;

import com.aacademy.realestate.model.Estate;
import com.aacademy.realestate.model.EstateFeature;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EstateResponse {

    private FloorDto floorDto;
    private Long id;
    private String builtUpArea;
    private String description;
    private String pureArea;
    private CityDto cityDto;
private Set<EstateFeatureDto> estateFeatureDtos;

}
