package pe.intercorp.retotech.rest.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data; 
@Data
public class ClientResponseDto {
	@ApiModelProperty(value = "ID del cliente", required = true, example = "514")
	private Integer id;
	@ApiModelProperty(value = "Nombre del cliente", required = true, example = "Gilmar")
	private String firstName; 
	@ApiModelProperty(value = "Apellido del cliente", required = true, example= "Lam")
	private String lastName; 
	@ApiModelProperty(value = "Edad del cliente", required = true, example= "28")
	private int age;  
	@ApiModelProperty(value = "Fecha de nacimiento del cliente", required = true, example= "19-07-1993")
	@JsonFormat(pattern="dd-MM-yyyy") 
	private Date  dateOfBirth; 
	@ApiModelProperty(value = "Fecha probable de muerte", required = true, example= "18-09-2064")
	@JsonFormat(pattern="dd-MM-yyyy") 
    @JsonInclude(Include.NON_NULL) 
	private Date  dateOfDeath; 
}
