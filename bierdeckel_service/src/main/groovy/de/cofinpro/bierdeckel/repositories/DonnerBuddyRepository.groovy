package de.cofinpro.bierdeckel.repositories

import de.cofinpro.bierdeckel.domain.DonnerBuddy
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 20.09.13
 * Time: 19:30
 * To change this template use File | Settings | File Templates.
 */
interface DonnerBuddyRepository extends PagingAndSortingRepository<DonnerBuddy, Long>, CrudRepository<DonnerBuddy, Long> {
    DonnerBuddy findForId(String id)
}
