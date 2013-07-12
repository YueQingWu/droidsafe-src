package java.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

public class NoSuchElementException extends RuntimeException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:05.264 -0400", hash_original_method = "7511719788F886A7A8274E764953E7B7", hash_generated_method = "DB2EC439058F2459B76E1B52F342488A")
    public  NoSuchElementException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:05.265 -0400", hash_original_method = "7D966D3BE675039003302E31B0D249C5", hash_generated_method = "4F0A68924BDC2EC633358C9FFEFBE43D")
    public  NoSuchElementException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:05.265 -0400", hash_original_field = "7D9412548456AED15D0C8DA571405261", hash_generated_field = "2F8B5DF88AA8723E0C5AAA5627E38C1C")

    private static final long serialVersionUID = 6769829250639411880L;
}

