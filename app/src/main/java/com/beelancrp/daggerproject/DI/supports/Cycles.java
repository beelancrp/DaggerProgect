package com.beelancrp.daggerproject.DI.supports;

/**
* Created by bilan on 23.03.2016.
*/
public final class Cycles {

    /** Lifecycle scope annotation constants. */
    public static final String ACTIVITY  = "activity";
    public static final String SERVICE   = "service";
    public static final String FRAGMENT  = "fragment";
    public static final String VIEW      = "view";

    private Cycles() {
        throw new AssertionError("Unable to instantiate");
    }
}

