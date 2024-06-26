package com.componente.factinven.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class FileHandle implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 private MultipartFile file;
	 private String url;
	
}
