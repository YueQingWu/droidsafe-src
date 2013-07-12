package gov.nist.javax.sip.header.ims;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import gov.nist.javax.sip.header.SIPHeaderList;

public class ServiceRouteList extends SIPHeaderList<ServiceRoute> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:38.232 -0400", hash_original_method = "C0CA39C0A35C17F8012D1D71020C7494", hash_generated_method = "357269883D61B3888F1D67DD56AA019B")
    public  ServiceRouteList() {
        super(ServiceRoute.class, ServiceRouteHeader.NAME);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:38.232 -0400", hash_original_method = "1032498AE96A3DBCEFF1D5F4D42985C8", hash_generated_method = "550443EEEF814053B8EB22D163190629")
    public Object clone() {
        ServiceRouteList retval = new ServiceRouteList();
Object varF627329B9209466293A1BF71D9AF7B2B_1028482401 =         retval.clonehlist(this.hlist);
        varF627329B9209466293A1BF71D9AF7B2B_1028482401.addTaint(taint);
        return varF627329B9209466293A1BF71D9AF7B2B_1028482401;
        // ---------- Original Method ----------
        //ServiceRouteList retval = new ServiceRouteList();
        //return retval.clonehlist(this.hlist);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:38.233 -0400", hash_original_field = "204BBA06A885F5F15AC6804DDBBC5155", hash_generated_field = "6B0CBD0A78E3E34C35CAC0019012F837")

    private static final long serialVersionUID = -4264811439080938519L;
}

