package com.rits.creationalpattern.abfactory;

/**
 * @author Ritesh
 * @Created On 12/12/18
 */
public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the eleven king";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
