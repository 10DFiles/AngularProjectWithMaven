package com.bd.AngularjsStudentCurd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bd.AngularjsStudentCurd.Model.StudentCurdBean;

public interface StudentCurdRepository extends
		JpaRepository<StudentCurdBean, String> {

	@Query("Select s FROM StudentCurdBean s WHERE s.id=:id")
	public StudentCurdBean FindStudentById(@Param("id") int id);

	@Modifying
	@Transactional
	@Query("Delete FROM StudentCurdBean as s WHERE s.id=:id")
	public void DeleteStudentById(@Param("id") int id);

	@Modifying
	@Transactional
	@Query("Update StudentCurdBean st SET st.mark=:mark, st.address=:address,st.name=:name1,st.studentID=:studentID WHERE st.id=:id")
	public int UpdateStudent(@Param("name1") String name1,
			@Param("address") String address, @Param("mark") String mark,
			@Param("id") int id, @Param("studentID") Long studentID);

	/*
	 * @Transactional
	 * 
	 * @Query(
	 * "Update StudentCurdBean as stubean SET stubean.Mark=stubean.getMark(), stubean.Address=stubean.getAddress() WHERE stubean.Name=s"
	 * ) public StudentCurdBean UpdateStudent(StudentCurdBean stubean);
	 */
}
