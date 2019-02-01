package com.rits.creationalpattern.abfactory;

/**
 * @author Ritesh
 * @Created On 12/12/18
 */
public class AbFactoryTest {
    public static void main(String[] args) {
        KingdomFactory factory = new ElfKingdomFactory();
        Army army = factory.createArmy();
        System.out.println(army.getDescription());
        King king = factory.createKing();
        System.out.println(king.getDescription());
        Castle castle = factory.createCastle();
        System.out.println(castle.getDescription());
    }
}
