
package com.datamigration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description: Description goes here.
 *
 * @author <a href="mailto:dushyant.shukla@senecaglobal.com@xxx">Dushyant
 *         Shukla</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DatamigrationDemoApplicationTests {

	@Autowired
	private JdbcTemplate template;

	/**
	 * @throws Exception
	 */
	@Test
	public void testDefaultSettings()
		throws Exception
	{
		assertThat(template.queryForObject("SELECT COUNT(*) from PERSON", Integer.class)).isEqualTo(1);
	}

}
