package org.njhis.armodule.db.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

/**
 * @author vaibhav
 *@date 12-Oct-2022
 * 
 */

@Entity
@Table(name = "CITIZEN_APPS")
@Data
public class CitizenAppEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appId;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PH_NUMBER")
	private String phoneNum;
	
	@Column(name = "SSN")
	private Long ssn;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "STATE")
	private String stateName;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	
	@Column(name = "DOB", updatable = false)
	private LocalDate dob; 
	
	
	@Column(name = "CREATED_DT", updatable = false)
	@CreationTimestamp
	private LocalDate createdDate; 
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	
	@Column(name = "UPDATED_DT", insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;
}
