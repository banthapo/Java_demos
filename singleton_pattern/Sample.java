package singleton_pattern;

import java.sql.DatabaseMetaData;
//package org.meicode.singletonpattern;

public class Sample {
    private static String instance;
    /* By declaring a variable as private, it is only accessible in other classes through getters
     * and setters which marks as one of singleton pattern */
    private String name;

    /* by making the constructor private it is only accessible to the class itself
    *  */
    private Sample(String str) {
        this.name = str;
    }

    /* this function has access to the private constructor since it is inside the class
    * the synchronized keyword makes the function to run on one thread at a time
    * --> not more than one thread can access it */
    public static synchronized String getDatabase(String str) {
        if(instance == null)
            instance = new Sample(str).getName();

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
