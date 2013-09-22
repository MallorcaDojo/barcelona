package de.cofinpro.bierdeckel.controller;


import de.cofinpro.bierdeckel.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
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


    @ResponseBody
    @RequestMapping(value = "/samplebuddy", method = RequestMethod.GET)
    public DonnerBuddy sampleDonnerBuddy() {
         return getDonnerBuddy(String.valueOf("34"));
    }

    @ResponseBody
    @RequestMapping(value = "/sampleparty", method = RequestMethod.GET)
    public Party sampleParty() {
        return getParty("343");
    }


    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.POST, consumes = "application/json")
    public Party testParty(@RequestBody Person person)  {

        System.out.println(person.getName());

        /*buddy.setId("12345");
        buddy.setCreated(new Date());
        buddy.setUpdated(new Date());
        buddy.setVersion(0l);

        party.setVersion(0l);
        party.setUpdated(new Date());
        party.setCreated(new Date());
        party.setDonnerBuddies(new ArrayList<DonnerBuddy>());
        party.getDonnerBuddies().add(buddy);
        party.setId("12345");
                */



        return new Party();
    }

    @ResponseBody
    @RequestMapping(value = "/partytest", method = RequestMethod.POST, consumes = "application/json")
    public Party testParty(@RequestBody Party party)  {

        party.setVersion(0l);
        party.setUpdated(new Date());
        party.setCreated(new Date());
        party.setId("12345");


        if(party.getDonnerBuddies() != null && party.getDonnerBuddies().size() > 0) {
            DonnerBuddy donnerBuddy = party.getDonnerBuddies().get(0);
            donnerBuddy.setId("3432");
            donnerBuddy.setCreated(new Date());
            donnerBuddy.setUpdated(new Date());
            donnerBuddy.setVersion(0l);

        }



        return party;
    }



    @Override
    @ResponseBody
    @RequestMapping(value = "/parties", method = RequestMethod.POST, consumes = "application/json")
    public Party addParty(@RequestBody Party party)  {
        if(party.getDonnerBuddies() != null && !party.getDonnerBuddies().isEmpty()) {
            DonnerBuddy buddy = party.getDonnerBuddies().get(0);
            buddy.setId("12345");
            buddy.setCreated(new Date());
            buddy.setUpdated(new Date());
            buddy.setVersion(0l);
        }


        party.setVersion(0l);
        party.setUpdated(new Date());
        party.setCreated(new Date());
        party.setId("12345");

       return party;
}


    private static DonnerBuddy getDonnerBuddy(String id) {
        DonnerBuddy donnerBuddy = new DonnerBuddy();
        donnerBuddy.setName("asdlajsdl" + id);
        donnerBuddy.setId(id);
        donnerBuddy.setUpdated(new Date());
        donnerBuddy.setCreated(new Date());
        donnerBuddy.setVersion(0l);
        return donnerBuddy;
    }

    private static Party getParty(String id) {
        Party party = new Party();
        party.setId(id);
        party.setName("My Buddies Party " + id);
        party.setUpdated(new Date());
        party.setCreated(new Date());
        party.setDonnerBuddies(new ArrayList<DonnerBuddy>());
        party.setDrinks(new ArrayList<Drink>());

        for(int i=0;i<4;i++) {
            DonnerBuddy donnerBuddy = getDonnerBuddy(String.valueOf(i));
            party.getDonnerBuddies().add(donnerBuddy);
        }

        int i=0;
        for(DonnerBuddy donnerBuddy: party.getDonnerBuddies()) {
            Drink drink = getDrink(String.valueOf(i));
            drink.setDonnerBuddy(donnerBuddy);
            party.getDrinks().add(drink);
            i++;
        }

        return party;
    }

    private static Drink getDrink(String id) {
        Drink drink = new Drink();
        drink.setName("adfsdf");
        drink.setUpdated(new Date());
        drink.setCreated(new Date());
        drink.setVersion(0l);




        return drink;
    }



    @Override
    @ResponseBody
    @RequestMapping(value = "/parties/{buddyId}", method = RequestMethod.GET)
    public List<Party> showParties(@PathVariable String buddyId) {

       List<Party> parties = new ArrayList<Party>();
       for(int i=0;i<3;i++) {
          Party tmpParty = getParty(String.valueOf(i));
          parties.add(tmpParty);
          //tmpParty.setDonnerBuddies(null);
          tmpParty.setDrinks(null);
       }


      return parties;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = "/parties/{partyId}", method = RequestMethod.POST)
    public DonnerBuddy addDonnerBuddy(@RequestBody DonnerBuddy buddy, @PathVariable String partyId)  {
        Party party = getParty(partyId);
        DonnerBuddy donnerBuddy = getDonnerBuddy("445");
        party.getDonnerBuddies().add(buddy);
        return donnerBuddy;
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
        List<Drink> drinks = new ArrayList<Drink>();
        for(int i=0;i<10;i++) {
            Drink drink = getDrink(String.valueOf(i));
            drink.setDonnerBuddy(getDonnerBuddy(String.valueOf(i)));
            drinks.add(drink);
        }

        return drinks;
    }
}
