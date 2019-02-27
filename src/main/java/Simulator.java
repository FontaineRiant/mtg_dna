/**
 * Project : mtg_dna
 * Author(s) : Antoine Friant
 * Date : 27.02.19
 */

import forge.CardStorageReader;
import forge.GuiBase;
import forge.GuiDesktop;
import forge.StaticData;
import forge.deck.CardPool;
import forge.deck.io.DeckStorage;
import forge.error.ExceptionHandler;
import forge.item.PaperCard;
import forge.view.SimulateMatch;
import forge.deck.Deck;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Simulator {
    public static void main(String args[]){
        Simulator simulator = new Simulator();
        simulator.proofOfConcept();
    }

    private void proofOfConcept() {
        Deck deckWW = new Deck("WW");
        CardPool poolWW = deckWW.getAllCardsInASinglePool();
        poolWW.add("Adanto Vanguard", "XLN", 2);
        poolWW.add("Benalish Marshal", 4);
        poolWW.add("Dauntless Bodyguard", 4);
        poolWW.add("Skymarcher Aspirant", 4);
        poolWW.add("Snubhorn Sentry", 4);
        poolWW.add("Tithe Taker", 4);
        poolWW.add("Venerated Loxodon", 4);
        poolWW.add("Conclave Tribunal", 4);
        poolWW.add("History of Benalia", 4);
        poolWW.add("Legion's Landing", 4);
        poolWW.add("Unbreakable Formation", 2);
        poolWW.add("Plains", 20);


        Deck deckRDW = new Deck("RDW");
        CardPool poolRDW = deckRDW.getAllCardsInASinglePool();
        poolRDW.add("Fanatical Firebrand", 4);
        poolRDW.add("Ghitu Lavarunner", 4);
        poolRDW.add("Runaway Steam-Kin", 3);
        poolRDW.add("Viashino Pyromancer", 4);
        poolRDW.add("Goblin Chainwhirler", 4);
        poolRDW.add("Shock", 3);
        poolRDW.add("Lightning Strike", 2);
        poolRDW.add("Light Up the Stage", 4);
        poolRDW.add("Risk Factor", 4);
        poolRDW.add("Skewer the Critics", 4);
        poolRDW.add("Wizard's Lightning", 2);
        poolRDW.add("Mountain", 20);

        DeckStorage deckStorage = new DeckStorage(new File("deckdir"), "");
        deckStorage.save(deckRDW);
        deckStorage.save(deckWW);

        SimulateMatch.simulate("sim -d WW RDW -n 1".split(" "));

    }

    private void simulateRound(int populationSize) {
    }
}
