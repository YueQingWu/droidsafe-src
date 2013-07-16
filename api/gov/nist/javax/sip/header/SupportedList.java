package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import javax.sip.header.*;

public class SupportedList extends SIPHeaderList<Supported> {
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.500 -0400", hash_original_method = "C97E7EF6FC87A3A068AC23349CE0B329", hash_generated_method = "9D8330A8D22F00AA1938D1F30E872420")
    public  SupportedList() {
        super(Supported.class, SupportedHeader.NAME);
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.501 -0400", hash_original_method = "45CDCD8BD327539AF66457D00250AD24", hash_generated_method = "C2A121FD9CA0BCB945ADFA1536AFE1D6")
    public Object clone() {
        SupportedList retval = new SupportedList();
        retval.clonehlist(this.hlist);
Object varF9E19AD6135C970F387F77C6F3DE4477_1185886957 =         retval;
        varF9E19AD6135C970F387F77C6F3DE4477_1185886957.addTaint(taint);
        return varF9E19AD6135C970F387F77C6F3DE4477_1185886957;
        // ---------- Original Method ----------
        //SupportedList retval = new SupportedList();
        //retval.clonehlist(this.hlist);
        //return retval;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.501 -0400", hash_original_field = "0C172D453BA0BA79FBC9C11E860BD33B", hash_generated_field = "C52F2E011560C6C75D9803CFE79F0EF9")

    private static final long serialVersionUID = -4539299544895602367L;
}

