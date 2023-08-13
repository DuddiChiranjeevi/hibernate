package com.amxa.entities;

import java.io.Serializable;
import java.util.Set;

import lombok.Data;
@Data
public class Project implements Serializable{

	private static final long serialVersionUID = 1L;
	private int projectId;
	private String projectTittle;
	private String clientName;
	private String domain;
	private int duration;
	private int teamSize;
	private Set<Associates> associates;
	
}
