package test;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/*import cn.justweb.mapper.EmployeeMapper;
import cn.justweb.pojo.EmployeeExample;*/
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/*
import cn.justweb.pojo.Employee;
import cn.justweb.pojo.EmployeeExample;
import cn.justweb.pojo.EmployeeExample.Criteria;
import cn.justweb.mapper.EmployeeMapper;
*/


public class TestMyBatisCache {

   /* @Test
    public void testMyBatis3() throws Exception {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

			//条件: 名字中带有'老师'并且部门id为102 或者 性别为男并且descr中带有'建'

			EmployeeExample example = new EmployeeExample();
			Criteria c1 = example.createCriteria();
			c1.andLastNameLike("%涛哥%");
			c1.andGenderBetween(0,1);


			Criteria c2 = example.createCriteria();
			c2.andGenderEqualTo(1);
			c2.andLastNameLike("%辉%");

			example.or(c2);


			// last_name like ? and gender between ? and ? ) or( gender = ? and last_name like ? )

			List<Employee> emps = mapper.selectByExample(example);

			for (Employee employee : emps) {
				System.out.println(employee);
			}

		} finally {
			session.close();
		}
    }*/

    @Test
    public void testMBG() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;

        String path = this.getClass().getClassLoader().getResource("mbg.xml").getPath();

        File configFile = new File(path);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }


    @Test
    public void test1() throws Exception{
       /* SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = new Employee();
        employee.setLastName("光尧");
        employee.setGender(1);
        employee.setDescr("45°");
        int insert = mapper.insert(employee);
        System.out.println("insert = " + insert);

        List<Employee> employees = mapper.selectAll();

        System.out.println("employees = " + employees);

        sqlSession.commit();*/

    }



}
