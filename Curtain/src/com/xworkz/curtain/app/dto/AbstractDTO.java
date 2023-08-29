package com.xworkz.curtain.app.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data

public class AbstractDTO implements Serializable{
	
	private String whoCreated;
	private String whoUpdated;
	private LocalDateTime whenUpdated;
	private LocalDateTime whenCreated;
	
	

}
