package android.graphics;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;

import droidsafe.helpers.DSUtils;

public class PixelXorXfermode extends Xfermode {
    
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    private static int nativeCreate(int opColor) {
        return opColor;
    }

    @DSComment("From safe class list")
    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:34:10.941 -0500", hash_original_method = "D83BD6D1A9BB9762D9B3F34AF8222FEA", hash_generated_method = "49761BF2B177A0B0BE27E037B184148F")
    
public PixelXorXfermode(int opColor) {
        native_instance = nativeCreate(opColor);
    }
    
}
