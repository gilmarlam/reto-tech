package pe.intercorp.retotech.rest.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class KpiClientResponseDto {
	@ApiModelProperty(value = "Promedio de edad de todos los clientes", required = true, example = "18")
	Integer average;
	@ApiModelProperty(value = "Desviación estándar entre las edades de todos los clientes", required = true, example = "7.18")
	double  standardDeviation;
}
