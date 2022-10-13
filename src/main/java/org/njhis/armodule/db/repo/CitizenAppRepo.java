package org.njhis.armodule.db.repo;

import org.njhis.armodule.db.entities.CitizenAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vaibhav
 *@date 12-Oct-2022
 * 
 */
public interface CitizenAppRepo extends JpaRepository<CitizenAppEntity, Long> {

}
