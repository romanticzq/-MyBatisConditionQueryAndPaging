package online.qsx.mapper;

import java.util.List;
import online.qsx.model.GradeModel;
import online.qsx.model.GradeModelCriteria;
import org.apache.ibatis.annotations.Param;

public interface GradeModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int countByExample(GradeModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int deleteByExample(GradeModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int deleteByPrimaryKey(Integer gradeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int insert(GradeModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int insertSelective(GradeModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    List<GradeModel> selectByExample(GradeModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    GradeModel selectByPrimaryKey(Integer gradeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int updateByExampleSelective(@Param("record") GradeModel record, @Param("example") GradeModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int updateByExample(@Param("record") GradeModel record, @Param("example") GradeModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int updateByPrimaryKeySelective(GradeModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Tue Nov 21 09:11:03 CST 2017
     */
    int updateByPrimaryKey(GradeModel record);
}