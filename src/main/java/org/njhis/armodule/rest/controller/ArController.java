package org.njhis.armodule.rest.controller;

import java.util.Map;

import org.njhis.armodule.config.MessageConfig;
import org.njhis.armodule.rest.request.CitizenReq;
import org.njhis.armodule.service.ArService;
import org.njhis.armodule.utility.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vaibhav
 *@date 13-Oct-2022
 * 
 */
@RestController
public class ArController {
	
	private ArService service;

	private Map<String, String> map;
	
	
	
	
	/**
	 * @param service
	 * @param map
	 */
	public ArController(ArService service, MessageConfig map) {
		super();
		this.service = service;
		this.map = map.getMessage();
	}




	@PostMapping("/register")
	public ResponseEntity<String> createApplication(@RequestBody CitizenReq reqbody) {
		Integer createApplication = service.createApplication(reqbody);
		if(createApplication > 0) {
			return new ResponseEntity<> (map.get(AppConstants.SUCCESS_MSG), HttpStatus.OK);
		}
		return new ResponseEntity<> (map.get(AppConstants.FAILED_MSG), HttpStatus.BAD_REQUEST);
	}

}
