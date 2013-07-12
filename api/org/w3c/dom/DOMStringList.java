package org.w3c.dom;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

public interface DOMStringList {
    
    public String item(int index);

    
    public int getLength();

    
    public boolean contains(String str);

}
