package gov.nist.javax.sip.header.ims;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import gov.nist.javax.sip.header.SIPHeaderList;
import gov.nist.javax.sip.header.ims.SecurityClient;

public class SecurityClientList extends SIPHeaderList<SecurityClient> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:38.197 -0400", hash_original_method = "917A181365931F7A6837DEBD96805F45", hash_generated_method = "E0A52096EC1B851DD08D91D4333A641E")
    public  SecurityClientList() {
        super(SecurityClient.class, SecurityClientHeader.NAME);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:38.198 -0400", hash_original_method = "8CB3EC0B5802F634A5AAC136D83D14DA", hash_generated_method = "33E28C659B1187C4662917B18BF7B8DB")
    public Object clone() {
        SecurityClientList retval = new SecurityClientList();
Object varF627329B9209466293A1BF71D9AF7B2B_1217703539 =         retval.clonehlist(this.hlist);
        varF627329B9209466293A1BF71D9AF7B2B_1217703539.addTaint(taint);
        return varF627329B9209466293A1BF71D9AF7B2B_1217703539;
        // ---------- Original Method ----------
        //SecurityClientList retval = new SecurityClientList();
        //return retval.clonehlist(this.hlist);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:38.198 -0400", hash_original_field = "E1C3B5A2AF0EAAE3887FDDB04B41D33B", hash_generated_field = "B92E7636CCB3AA76B1E07C77D59BF0D0")

    private static final long serialVersionUID = 3094231003329176217L;
}

