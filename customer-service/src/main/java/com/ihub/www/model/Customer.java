package com.ihub.www.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table	
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer
{
	@Id
	private int custId;
	@Column
	private String custName;
	@Column
	private String custAdd;

}