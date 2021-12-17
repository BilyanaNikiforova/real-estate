package com.aacademy.realestate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Embeddable
@Builder
public class Quadrature {

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal builtUpArea;

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal pureArea;

}
