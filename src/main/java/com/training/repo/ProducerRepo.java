package com.training.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.bean.Producer;


@Repository
public interface ProducerRepo extends JpaRepository<Producer, String> {

	/*
	 * public List<Producer> findBySkillset(String skillset); public List<Producer>
	 * findByMobileNo(long mobileNo); public Producer
	 * findByTrainercodeAndSkillset(String trainercod,String skillset);
	 * 
	 * //find all books based on title pattern.
	 * 
	 * public List<Producer> findBySkillsetLike(String pattern);
	 * 
	 * //find all books whose stock is < n
	 * 
	 * public List<Producer> findByMobileNoLessThan(long mobileNo);
	 * 
	 * @Query("select b from Producer b where b.skillset like :p") public
	 * List<Producer> abc(@Param("p") String pattern);
	 * 
	 * 
	 * @Query("select b from Producer b where b.MobileNo < :mobileNo") public
	 * List<Producer> mobileNoLessThanStock(@Param("mobileNo") long mobileNo);
	 * 
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query("update Book b set b.mobileNo=:newmobileNo where b.mobileNo < :mobileNo"
	 * ) public int updateMobileNo(@Param("newmobileNo") long
	 * newmobileNo,@Param("mobileNo") long mobileNo);
	 * 
	 */
	
	
	
	
	
}
	