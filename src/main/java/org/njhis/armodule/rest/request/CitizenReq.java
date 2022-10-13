package org.njhis.armodule.rest.request;

import java.time.LocalDate;

import lombok.Data;

/**
 * @author vaibhav
 *@date 12-Oct-2022
 * 
 */

@Data
public class CitizenReq {
	private String fullName;
	private String email;
	private String phoneNum;
	private Long ssn;
	private String gender;
	private LocalDate dob;
}
