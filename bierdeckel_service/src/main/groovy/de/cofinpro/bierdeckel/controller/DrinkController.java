package de.cofinpro.bierdeckel.controller;

import de.cofinpro.bierdeckel.domain.Drink;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: mheck
 * Date: 20.09.13
 * Time: 18:37
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DrinkController {

    @ResponseBody
    @RequestMapping(value = "/drinks/{name}/{price}", method = RequestMethod.GET)
    public Drink drinks(@PathVariable String name, @PathVariable String price) {
        Double priceAsDouble;
        priceAsDouble = Double.parseDouble(price);

        Drink drink = new Drink();
        drink.setName(name);
        drink.setPrice(priceAsDouble);

        return drink;
    }

}