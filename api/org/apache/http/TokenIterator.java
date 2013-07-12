package org.apache.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.util.Iterator;

public interface TokenIterator extends Iterator {

    
    boolean hasNext()
        ;


    
    String nextToken()
        ;
}
