package de.cofinpro.bierdeckel.domain

import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Field

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 19:02
 * To change this template use File | Settings | File Templates.
 */
class Party extends AbsEntity{

	@Field("id")
	String element_id

    @Field("name")
    String name

    @Field("location")
    String location

    @Field("latitude")
    String latitude

    @Field("longitude")
    String longitude

    @DBRef
    List<Drink> drinks

    @DBRef
    List<DonnerBuddy> donnerBuddies




}
