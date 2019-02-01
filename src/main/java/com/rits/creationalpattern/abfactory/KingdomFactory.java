package com.rits.creationalpattern.abfactory;

/**
 * @author Ritesh
 * @Created On 12/12/18
 */
public interface KingdomFactory {
    Castle createCastle();
    Army createArmy();
    King createKing();

}
