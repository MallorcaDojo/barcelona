package de.cofinpro.bierdeckel.domain

import org.springframework.data.mongodb.core.mapping.Field

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 18:37
 * To change this template use File | Settings | File Templates.
 */
class Location extends AbsEntity{

    @Field("name")
    String name

    @Field("latitude")
    String latitude

    @Field("longitude")
    String longitude
}
