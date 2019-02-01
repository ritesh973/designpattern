package com.rits.creationalpattern.abfactory;

/**
 * @author Ritesh
 * @Created On 12/12/18
 */
public class ElfCastle implements Castle {
    static final String DESCRIPTION = "This is the eleven castle";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
