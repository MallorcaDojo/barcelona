package de.cofinpro.bierdeckel.repositories

import de.cofinpro.bierdeckel.domain.Party
import org.springframework.data.repository.CrudRepository

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */
public interface PartyRepository extends CrudRepository<Party, String>{

}