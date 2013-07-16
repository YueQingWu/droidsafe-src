package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import javax.sip.header.*;

public class WarningList extends SIPHeaderList<Warning> {
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.682 -0400", hash_original_method = "8098AC8A06CDB819C465A9D30CC2E5BB", hash_generated_method = "62F1F7BE0861080B87B988F0A42FF4AC")
    public  WarningList() {
        super(Warning.class, Warning.NAME);
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.682 -0400", hash_original_method = "266F52C906228C3D1DC5D5C7E03D3C84", hash_generated_method = "4BF0F6034C268956C17BF4F4613887BA")
    public Object clone() {
        WarningList retval = new WarningList();
Object varF627329B9209466293A1BF71D9AF7B2B_1992108987 =         retval.clonehlist(this.hlist);
        varF627329B9209466293A1BF71D9AF7B2B_1992108987.addTaint(taint);
        return varF627329B9209466293A1BF71D9AF7B2B_1992108987;
        // ---------- Original Method ----------
        //WarningList retval = new WarningList();
        //return retval.clonehlist(this.hlist);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.682 -0400", hash_original_field = "0D28E51547CF8629AAEF431248291D24", hash_generated_field = "546B02DCE7471BB4B665A16CFACDC783")

    private static final long serialVersionUID = -1423278728898430175L;
}

