package ssm;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sqadmin.base.entity.BaseEntity;
import com.sqadmin.base.service.BaseService;

public class DemoTest extends SpringBaseTest {
	@Autowired
	private BaseService base;

	@Test
	public void selectUserByIdTest() {
		BaseEntity entity = (BaseEntity) base.findById(10000003);
		System.out.println(entity.getCreator());
	}
}
