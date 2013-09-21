package de.cofinpro.bierdeckel.controller;


import de.cofinpro.bierdeckel.domain.Bill;
import de.cofinpro.bierdeckel.domain.DonnerBuddy;
import de.cofinpro.bierdeckel.domain.Drink;
import de.cofinpro.bierdeckel.domain.Party;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 18:44
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class PartyController implements PartyDao {

    @Override
    @ResponseBody
    @RequestMapping(value = "/parties", method = RequestMethod.POST)
    public Party addParty(@RequestBody DonnerBuddy buddy, @RequestBody Party party)  {
       return null;
    }


    @Override
    @ResponseBody
    @RequestMapping(value = "/parties/{buddyId}", method = RequestMethod.GET)
    public List<Party> showParties(@PathVariable String buddyId) {
      return null;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = "/parties/{partyId}", method = RequestMethod.POST)
    public DonnerBuddy addDonnerBuddy(@RequestBody DonnerBuddy buddy, @PathVariable String partyId)  {
      return null;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = "/drinks/{partyId}/{buddyId}", method = RequestMethod.POST)
    public Drink addDrink(@PathVariable String partyId, @PathVariable String buddyId, @RequestBody Drink drink) {
        return null;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = "/drinks/{partyId}", method = RequestMethod.GET)
    public List<Drink> showDrinks(@PathVariable String partyId) {
        return null;
    }

    public Bill createBill(String partyId) {
        Bill b = new Bill();

        return b;
    }
}
