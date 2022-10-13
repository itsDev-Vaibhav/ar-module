package org.njhis.armodule.service;

import org.njhis.armodule.db.entities.CitizenAppEntity;
import org.njhis.armodule.db.repo.CitizenAppRepo;
import org.njhis.armodule.rest.request.CitizenReq;
import org.njhis.armodule.utility.AppConstants;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author vaibhav
 *@date 12-Oct-2022
 * 
 */

@Service
public class ArServiceImpl implements ArService{

	@Autowired
	private CitizenAppRepo repo;
	
	@Override
	public Integer createApplication(CitizenReq req) {
		RestTemplate template = new RestTemplate(); 
		ResponseEntity<String> respEntity = template.getForEntity(AppConstants.SSA_URL + req.getSsn(), String.class);
		String state = respEntity.getBody();
		if("New Jersey".equals(state)) {
			CitizenAppEntity entity = new CitizenAppEntity();
			BeanUtils.copyProperties(req, entity);
			entity.setStateName(state);
			try {
				repo.save(entity);
				return 1;
			} catch (Exception e) {
				return 0;
			}
		}
		return 0;
	}
	
	

}
