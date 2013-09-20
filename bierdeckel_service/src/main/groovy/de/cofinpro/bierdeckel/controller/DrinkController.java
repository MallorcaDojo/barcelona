package de.cofinpro.bierdeckel.controller;

import de.cofinpro.bierdeckel.domain.Drink;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/drinks/{name}", method = RequestMethod.GET)
    public Drink drinks(@PathVariable("name") String name) {
        System.out.println("Hallo Welt");

        Drink drink = new Drink();
        drink.setName(name);
        return drink;
    }

}