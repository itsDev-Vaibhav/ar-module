package org.njhis.armodule.service;

import org.njhis.armodule.rest.request.CitizenReq;

/**
 * @author vaibhav
 *@date 12-Oct-2022
 * 
 */

public interface ArService {
	
	public Integer createApplication(CitizenReq req);
	

}
