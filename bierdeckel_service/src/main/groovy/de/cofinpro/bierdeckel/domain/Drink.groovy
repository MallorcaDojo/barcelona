package de.cofinpro.bierdeckel.domain

import org.springframework.data.mongodb.core.mapping.Field

/**
 * Created with IntelliJ IDEA.
 * User: mheck
 * Date: 20.09.13
 * Time: 18:32
 * To change this template use File | Settings | File Templates.
 */
class Drink extends AbsEntity {
    @Field("name")
    String name

    @Field("price")
    Double price
}
