/**
 *
 */

package com.datamigration.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.datamigration.entity.Person;

/**
 * Description: Description goes here.
 *
 * @author <a href="mailto:dushyant.shukla@senecaglobal.com@xxx">Dushyant
 *         Shukla</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
@Repository
public interface PersonRepository
	extends CrudRepository<Person, Long>
{
	// empty block
}
