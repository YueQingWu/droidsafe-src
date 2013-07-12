package org.bouncycastle.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.io.InputStream;

public interface ASN1OctetStringParser
    extends DEREncodable, InMemoryRepresentable
{
    public InputStream getOctetStream();
}
