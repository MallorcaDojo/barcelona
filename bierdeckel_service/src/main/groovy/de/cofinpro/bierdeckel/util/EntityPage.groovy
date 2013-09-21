package de.cofinpro.bierdeckel.util

import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 20.09.13
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
class EntityPage implements Pageable {

    int page
    int itemsPerPage

    @Override
    int getPageNumber() {
        return page  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getPageSize() {
        return itemsPerPage  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    int getOffset() {
        return 0  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    Sort getSort() {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }
}
