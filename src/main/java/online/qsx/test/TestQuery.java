package online.qsx.test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import online.qsx.mapper.GradeModelMapper;
import online.qsx.mapper.StudentModelMapper;
import online.qsx.model.GradeModel;
import online.qsx.model.GradeModelCriteria;
import online.qsx.model.GradeModelCriteria.Criteria;
import online.qsx.model.StudentModel;
import online.qsx.model.StudentModelCriteria;

public class TestQuery {

	public static void main(String[] args) throws Exception {
//		new TestQuery().test();
		//测试学生年级连接查询
		new TestQuery().testStuAndGra();
	}
	
	SqlSession sqlSession = null;
	GradeModelMapper gradeModelMapper;
	StudentModelMapper studentModelMapper;
	
	/*
	 * 连接数据库
	 */
	public void init() throws Exception {
		String resource="Configuration.xml";
		//加载配置文件
		InputStream is=Resources.getResourceAsStream(resource);
		//建立会话工厂
		SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
		//开启数据库连接
		sqlSession=ssf.openSession();
		//get一个实现类
		gradeModelMapper=sqlSession.getMapper(GradeModelMapper.class);
		studentModelMapper=sqlSession.getMapper(StudentModelMapper.class);
	}
	
	/*
	 * 关闭数据库
	 */
	public void destory() {
		//提交事务
		sqlSession.commit();
		//关闭数据库
		sqlSession.close();
	}
	/*
	 * 模糊查询年级
	 */
	public void test() throws Exception {
		init();
		//条件工具
		GradeModelCriteria gmc=new GradeModelCriteria();
		//条件对象
		Criteria criteria=gmc.createCriteria();
		//添加条件
		criteria.andGradenameLike("%大%");
		//执行查询
		List<GradeModel> list=gradeModelMapper.selectByExample(gmc);
		//输出
		for(GradeModel temp:list) {
			System.out.println(temp);
		}
		
		destory();
	}
	/*
	 * 学生年级学科成绩联合查询
	 */
	public void testStuAndGra() throws Exception {
		init();
		
		//条件
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "%李%");
		map.put("sex", "1");
		map.put("gradename", "%四%");
		map.put("subjectname", "%数学%");
		map.put("minresult", "60");
		map.put("maxresult", "80");
		
		//获取第1页，10条内容，默认查询总数count
		PageHelper.startPage(1, 2);
		//紧跟着的第一个select方法会被分页
		List<StudentModel> list=studentModelMapper.findStudentAndGradeAndSubjectAndResult(map);
		//用PageInfo对结果进行包装
		PageInfo<StudentModel> pageinfo=new PageInfo<>(list);
		System.out.println(pageinfo.toString());
		for (StudentModel studentModel : list) {
			System.out.println(studentModel);
		}
		destory();
	}
}
