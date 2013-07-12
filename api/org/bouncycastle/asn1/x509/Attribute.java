package org.bouncycastle.asn1.x509;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

public class Attribute extends ASN1Encodable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:39.933 -0400", hash_original_field = "1EF64C012A52F50C55650F0FE7546D9A", hash_generated_field = "4851D4166E5BF16AA64E550E5ECE0B30")

    private DERObjectIdentifier attrType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:39.933 -0400", hash_original_field = "EFD717FE854DB7E7EF6210D033ABA119", hash_generated_field = "240506915FE52EB5683D0C9895D89C66")

    private ASN1Set attrValues;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:39.934 -0400", hash_original_method = "F858B1E12EC141756BCF51707692EAE3", hash_generated_method = "EAF843E457863A3930C595097EF40B9A")
    public  Attribute(
        ASN1Sequence seq) {
    if(seq.size() != 2)        
        {
            IllegalArgumentException varA2072CF614C7B8C7696DD5A02DBCCE9C_1013233827 = new IllegalArgumentException("Bad sequence size: " + seq.size());
            varA2072CF614C7B8C7696DD5A02DBCCE9C_1013233827.addTaint(taint);
            throw varA2072CF614C7B8C7696DD5A02DBCCE9C_1013233827;
        } //End block
        attrType = DERObjectIdentifier.getInstance(seq.getObjectAt(0));
        attrValues = ASN1Set.getInstance(seq.getObjectAt(1));
        // ---------- Original Method ----------
        //if (seq.size() != 2)
        //{
            //throw new IllegalArgumentException("Bad sequence size: " + seq.size());
        //}
        //attrType = DERObjectIdentifier.getInstance(seq.getObjectAt(0));
        //attrValues = ASN1Set.getInstance(seq.getObjectAt(1));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:39.934 -0400", hash_original_method = "38B63F7591289E34615CCB148E077DFB", hash_generated_method = "C56BC70F4D19D384749367E1C1179BC3")
    public  Attribute(
        DERObjectIdentifier attrType,
        ASN1Set             attrValues) {
        this.attrType = attrType;
        this.attrValues = attrValues;
        // ---------- Original Method ----------
        //this.attrType = attrType;
        //this.attrValues = attrValues;
    }

    
        public static Attribute getInstance(
        Object o) {
        if (o == null || o instanceof Attribute)
        {
            return (Attribute)o;
        }
        if (o instanceof ASN1Sequence)
        {
            return new Attribute((ASN1Sequence)o);
        }
        throw new IllegalArgumentException("unknown object in factory: " + o.getClass().getName());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:39.935 -0400", hash_original_method = "C61254DD25EA79572F2B43B889534711", hash_generated_method = "EFDB2EE525BF22AB109220C6CB34D9FF")
    public ASN1ObjectIdentifier getAttrType() {
ASN1ObjectIdentifier var4DC76BA213854B470841C5B398272A26_173132939 =         new ASN1ObjectIdentifier(attrType.getId());
        var4DC76BA213854B470841C5B398272A26_173132939.addTaint(taint);
        return var4DC76BA213854B470841C5B398272A26_173132939;
        // ---------- Original Method ----------
        //return new ASN1ObjectIdentifier(attrType.getId());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:39.935 -0400", hash_original_method = "3714D5AC97801D67C3C70862DB57F642", hash_generated_method = "5631F397CFA2DCAB641D651412460E34")
    public ASN1Encodable[] getAttributeValues() {
ASN1Encodable[] var62CC3281B32ED3E929A0D40B228643F8_136495898 =         attrValues.toArray();
        var62CC3281B32ED3E929A0D40B228643F8_136495898.addTaint(taint);
        return var62CC3281B32ED3E929A0D40B228643F8_136495898;
        // ---------- Original Method ----------
        //return attrValues.toArray();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:39.936 -0400", hash_original_method = "0C9FA4513BA0CB1318C076F6A4C1BAA0", hash_generated_method = "F8D9C3BB4D8BC874430DF9398FA80AC0")
    public ASN1Set getAttrValues() {
ASN1Set varC1BD46225B9E104129100789C289BE4C_677975461 =         attrValues;
        varC1BD46225B9E104129100789C289BE4C_677975461.addTaint(taint);
        return varC1BD46225B9E104129100789C289BE4C_677975461;
        // ---------- Original Method ----------
        //return attrValues;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:49:39.936 -0400", hash_original_method = "7FF9F3775D261945F5C8461E1521856A", hash_generated_method = "FBFA44711766938A0E6DAB3E13CB24D1")
    public DERObject toASN1Object() {
        ASN1EncodableVector v = new ASN1EncodableVector();
        v.add(attrType);
        v.add(attrValues);
DERObject var0B338F106E3279986C87B595B0F4A439_1343053949 =         new DERSequence(v);
        var0B338F106E3279986C87B595B0F4A439_1343053949.addTaint(taint);
        return var0B338F106E3279986C87B595B0F4A439_1343053949;
        // ---------- Original Method ----------
        //ASN1EncodableVector v = new ASN1EncodableVector();
        //v.add(attrType);
        //v.add(attrValues);
        //return new DERSequence(v);
    }

    
}

