package org.apache.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import org.apache.http.util.CharArrayBuffer;

public interface FormattedHeader extends Header {


    
    CharArrayBuffer getBuffer()
        ;

    
    int getValuePos()
        ;

}
