
package com.datamigration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datamigration.repository.PersonRepository;

/**
 * Description: Description goes here.
 *
 * @author <a href="mailto:dushyant.shukla@senecaglobal.com@xxx">Dushyant
 *         Shukla</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
@SpringBootApplication
public class DatamigrationDemoApplication
	implements CommandLineRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DatamigrationDemoApplication.class, args);
	}

	@Autowired
	private PersonRepository repository;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(@SuppressWarnings("unused") String ... args)
		throws Exception
	{
		System.err.println(repository.findAll());
	}
}
