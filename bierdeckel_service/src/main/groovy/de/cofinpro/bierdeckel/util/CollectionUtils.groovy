package de.cofinpro.bierdeckel.util

import de.cofinpro.bierdeckel.domain.AbsEntity

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 20.09.13
 * Time: 19:44
 * To change this template use File | Settings | File Templates.
 */
class CollectionUtils {

    static void addAll(List collection, Iterable iterator) {
        while (iterator.hasNext()) {
            collection.add(iterator.next());
        }
    }

}
