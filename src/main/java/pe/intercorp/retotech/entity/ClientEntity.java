package pe.intercorp.retotech.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data; 

@Data
@Entity 
@Table(name = "Client")
public class ClientEntity {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	 
	private String firstName; 
	private String lastName; 
	private int age;  
	private Date  dateOfBirth; 
	private Date  created; 
	
}
