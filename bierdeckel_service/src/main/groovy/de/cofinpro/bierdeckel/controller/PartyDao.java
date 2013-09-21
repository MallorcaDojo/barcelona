package de.cofinpro.bierdeckel.controller;

import de.cofinpro.bierdeckel.domain.DonnerBuddy;
import de.cofinpro.bierdeckel.domain.Drink;
import de.cofinpro.bierdeckel.domain.Party;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 23:05
 * To change this template use File | Settings | File Templates.
 */
public interface PartyDao {
    @ResponseBody
    @RequestMapping(value = "/parties", method = RequestMethod.POST)
    Party addParty(@RequestBody DonnerBuddy buddy, @RequestBody Party party);

    @ResponseBody
    @RequestMapping(value = "/parties/{buddyId}", method = RequestMethod.GET)
    List<Party> showParties(@PathVariable String buddyId);

    @ResponseBody
    @RequestMapping(value = "/parties/{partyId}", method = RequestMethod.POST)
    DonnerBuddy addDonnerBuddy(@RequestBody DonnerBuddy buddy, @PathVariable String partyId);

    @ResponseBody
    @RequestMapping(value = "/drinks/{partyId}/{buddyId}", method = RequestMethod.POST)
    Drink addDrink(@PathVariable String partyId, @PathVariable String buddyId, @RequestBody Drink drink);

    @ResponseBody
    @RequestMapping(value = "/drinks/{partyId}", method = RequestMethod.GET)
    List<Drink> showDrinks(@PathVariable String partyId);
}
