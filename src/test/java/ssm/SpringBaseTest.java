package ssm;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//ָ��beanע��������ļ� 

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
//ʹ�ñ�׼��JUnit @RunWithע��������JUnitʹ��Spring TestRunner  
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBaseTest extends AbstractJUnit4SpringContextTests {


	
}
