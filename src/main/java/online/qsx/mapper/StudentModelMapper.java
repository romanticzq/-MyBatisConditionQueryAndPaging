package online.qsx.mapper;

import java.util.List;
import java.util.Map;

import online.qsx.model.StudentModel;
import online.qsx.model.StudentModelCriteria;
import org.apache.ibatis.annotations.Param;

public interface StudentModelMapper {
	
	//查找学生与年级
//	List<StudentModel> findStudentAndGrade(Map con);
	List<StudentModel> findStudentAndGradeAndSubjectAndResult(Map con);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int countByExample(StudentModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int deleteByExample(StudentModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int deleteByPrimaryKey(Integer studentno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int insert(StudentModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int insertSelective(StudentModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    List<StudentModel> selectByExample(StudentModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    StudentModel selectByPrimaryKey(Integer studentno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int updateByExampleSelective(@Param("record") StudentModel record, @Param("example") StudentModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int updateByExample(@Param("record") StudentModel record, @Param("example") StudentModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int updateByPrimaryKeySelective(StudentModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int updateByPrimaryKey(StudentModel record);
}