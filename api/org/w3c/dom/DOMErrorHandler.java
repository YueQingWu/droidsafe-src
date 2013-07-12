package org.w3c.dom;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

public interface DOMErrorHandler {
    
    public boolean handleError(DOMError error);

}
