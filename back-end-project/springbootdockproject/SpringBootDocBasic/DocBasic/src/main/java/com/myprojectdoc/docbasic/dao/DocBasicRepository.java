package com.myprojectdoc.docbasic.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface DocBasicRepository  extends CrudRepository<DocBasicEntity, Long>  {
	//@Query(value = "select * from warehouse_configuration_data_entity where tenant = :tenant order by created_date desc limit 1", nativeQuery = true)
	//List<WarehouseConfigurationDataEntity> fetchWC(@Param("tenant") String tenant);
	
	@Query(value = "insert into doc_basic_entity(username) values(:username)", nativeQuery = true)
	List<DocBasicEntity> fetchWC(@Param("username") String username);
	
}
