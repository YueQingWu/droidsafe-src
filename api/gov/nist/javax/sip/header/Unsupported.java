package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.text.ParseException;

public class Unsupported extends SIPHeader implements javax.sip.header.UnsupportedHeader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.548 -0400", hash_original_field = "7215DE10AF39CFD62967156F13524AEE", hash_generated_field = "EA9E843EF6C95A0999AD8B5523E0E7B3")

    protected String optionTag;
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.548 -0400", hash_original_method = "7F4BD1C3AF5762ECCF124F3A56ADDC67", hash_generated_method = "20CE9BE220E1B76B99762452ADA57ECB")
    public  Unsupported() {
        super(NAME);
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.548 -0400", hash_original_method = "91BBA837F044D0A0A4874364E40F6125", hash_generated_method = "2C85D3B90F3F77053ABDF107887B68AA")
    public  Unsupported(String ot) {
        super(NAME);
        optionTag = ot;
        // ---------- Original Method ----------
        //optionTag = ot;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.548 -0400", hash_original_method = "9C711BE19A8C0E0A7CB116A3F753C6F0", hash_generated_method = "F157BB7E945056FD52F137EE791F25DD")
    public String encodeBody() {
String var05FAD6E650FDF64778D62F7CDA67F749_1481563964 =         optionTag;
        var05FAD6E650FDF64778D62F7CDA67F749_1481563964.addTaint(taint);
        return var05FAD6E650FDF64778D62F7CDA67F749_1481563964;
        // ---------- Original Method ----------
        //return optionTag;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.549 -0400", hash_original_method = "CE304AE728C556B979775346D4C5B456", hash_generated_method = "03ECADA531E5AC0DD4C53D3D606D14E2")
    public String getOptionTag() {
String var05FAD6E650FDF64778D62F7CDA67F749_1180891168 =         optionTag;
        var05FAD6E650FDF64778D62F7CDA67F749_1180891168.addTaint(taint);
        return var05FAD6E650FDF64778D62F7CDA67F749_1180891168;
        // ---------- Original Method ----------
        //return optionTag;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.549 -0400", hash_original_method = "3B18B091D01592A1C9601DEA63572A7E", hash_generated_method = "7AA81AC52B958BFEA0F91F3060E036A5")
    public void setOptionTag(String o) throws ParseException {
    if(o == null)        
        {
        NullPointerException varE11526D4B61CEC11778CBDE441659081_555294345 = new NullPointerException(
                "JAIN-SIP Exception, "
                    + " Unsupported, setOptionTag(), The option tag parameter is null");
        varE11526D4B61CEC11778CBDE441659081_555294345.addTaint(taint);
        throw varE11526D4B61CEC11778CBDE441659081_555294345;
        }
        optionTag = o;
        // ---------- Original Method ----------
        //if (o == null)
            //throw new NullPointerException(
                //"JAIN-SIP Exception, "
                    //+ " Unsupported, setOptionTag(), The option tag parameter is null");
        //optionTag = o;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:37.549 -0400", hash_original_field = "729B4B74845ACBCF4C5028ED87BE3471", hash_generated_field = "E6F62805C9FB301CFBA40BB42552946D")

    private static final long serialVersionUID = -2479414149440236199L;
}

