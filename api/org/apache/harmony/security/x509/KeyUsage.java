package org.apache.harmony.security.x509;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.io.IOException;
import org.apache.harmony.security.asn1.ASN1BitString;
import org.apache.harmony.security.asn1.ASN1Type;

public final class KeyUsage extends ExtensionValue {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:19.150 -0400", hash_original_field = "D5EDBDDB1AE6E3CE3EE0E039107E39E4", hash_generated_field = "C6468962076BC1172F0F351DE545D4EE")

    private boolean[] keyUsage;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:19.151 -0400", hash_original_method = "DB6BBF789AE77B5AE6E5E06EC389C87F", hash_generated_method = "93E839BBB32F603F214F35D4E964F3AE")
    public  KeyUsage(byte[] encoding) throws IOException {
        super(encoding);
        this.keyUsage = (boolean[]) ASN1.decode(encoding);
        // ---------- Original Method ----------
        //this.keyUsage = (boolean[]) ASN1.decode(encoding);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:19.151 -0400", hash_original_method = "14A58386ABBA8977CF43289C95A15404", hash_generated_method = "BA78D7F300F0B8B2AD2A67BA4509CF34")
    public boolean[] getKeyUsage() {
        boolean[] varD5EDBDDB1AE6E3CE3EE0E039107E39E4_22999851 = (keyUsage);
                boolean[] var503EB2F420079C4024483971CE5EDEA8_1950767875 = {getTaintBoolean()};
        return var503EB2F420079C4024483971CE5EDEA8_1950767875;
        // ---------- Original Method ----------
        //return keyUsage;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:19.152 -0400", hash_original_method = "F00F1E8212387BCE78D166E85787DB94", hash_generated_method = "E937094768920BD10A632C702DE0E6F8")
    @Override
    public byte[] getEncoded() {
    if(encoding == null)        
        {
            encoding = ASN1.encode(keyUsage);
        } //End block
        byte[] var84BEA1F0FD2CE16F7E562A9F06EF03D3_129612866 = (encoding);
                byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_612010894 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_612010894;
        // ---------- Original Method ----------
        //if (encoding == null) {
            //encoding = ASN1.encode(keyUsage);
        //}
        //return encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:19.152 -0400", hash_original_method = "C3D25371DA677875302E0FC1058C6A6C", hash_generated_method = "79CB06BD6AFE962EE7B5801D047545FB")
    @Override
    public void dumpValue(StringBuilder sb, String prefix) {
        addTaint(prefix.getTaint());
        addTaint(sb.getTaint());
        sb.append(prefix).append("KeyUsage [\n");
for(int i = 0;i < keyUsage.length;i++)
        {
    if(keyUsage[i])            
            {
                sb.append(prefix).append("  ").append(USAGES[i]).append('\n');
            } //End block
        } //End block
        sb.append(prefix).append("]\n");
        // ---------- Original Method ----------
        //sb.append(prefix).append("KeyUsage [\n");
        //for (int i = 0; i < keyUsage.length; i++) {
            //if (keyUsage[i]) {
                //sb.append(prefix).append("  ").append(USAGES[i]).append('\n');
            //}
        //}
        //sb.append(prefix).append("]\n");
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:19.152 -0400", hash_original_field = "702DDBA39271BC18146A500F7F424BBD", hash_generated_field = "830B315CB33B2EEE4101ABD18F32DE61")

    private static final String[] USAGES = {
        "digitalSignature",
        "nonRepudiation",
        "keyEncipherment",
        "dataEncipherment",
        "keyAgreement",
        "keyCertSign",
        "cRLSign",
        "encipherOnly",
        "decipherOnly",
    };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:19.152 -0400", hash_original_field = "5094F4CF60830A3061523AA234980FE6", hash_generated_field = "4E02BB773E266ED5A03D43D3E2D818EF")

    private static final ASN1Type ASN1 = new ASN1BitString.ASN1NamedBitList(9);
}

