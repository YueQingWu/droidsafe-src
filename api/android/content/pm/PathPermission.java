package android.content.pm;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PatternMatcher;

public class PathPermission extends PatternMatcher {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:14.068 -0400", hash_original_field = "3805826D63CBE0EFB018A286F189CC44", hash_generated_field = "F91CBC541AE5EA168107190D1A494CD8")

    private String mReadPermission;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:14.068 -0400", hash_original_field = "EA3BA31BE3E977A5CA4A690ADA101637", hash_generated_field = "02101D3B9ECFAAEB0689EF2DAEF4A808")

    private String mWritePermission;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:14.069 -0400", hash_original_method = "79E6B4567C92E932C6F7E4E0D19FFE51", hash_generated_method = "4568ACBB936CA6A8B049B8E42B8A5D40")
    public  PathPermission(String pattern, int type, String readPermission,
            String writePermission) {
        super(pattern, type);
        addTaint(type);
        addTaint(pattern.getTaint());
        mReadPermission = readPermission;
        mWritePermission = writePermission;
        // ---------- Original Method ----------
        //mReadPermission = readPermission;
        //mWritePermission = writePermission;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:14.069 -0400", hash_original_method = "385FCFD08A13461BC5260866E3C7CF08", hash_generated_method = "2CFA3C43C9AE7BF1B7EC3DE937629DFA")
    public  PathPermission(Parcel src) {
        super(src);
        mReadPermission = src.readString();
        mWritePermission = src.readString();
        // ---------- Original Method ----------
        //mReadPermission = src.readString();
        //mWritePermission = src.readString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:14.070 -0400", hash_original_method = "5C94FD95ADD3C0054247C1BF6F500E4F", hash_generated_method = "D91CAC15B8652BD0A4F68D8F345B76B2")
    public String getReadPermission() {
String varB7C8F391110CA2789E72296FC3D45BB5_1034908787 =         mReadPermission;
        varB7C8F391110CA2789E72296FC3D45BB5_1034908787.addTaint(taint);
        return varB7C8F391110CA2789E72296FC3D45BB5_1034908787;
        // ---------- Original Method ----------
        //return mReadPermission;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:14.070 -0400", hash_original_method = "7A0A16A9FA1EB10AD9D087C65A3EFFB1", hash_generated_method = "FCA40E0B29BC44FE7CE26C494330F95A")
    public String getWritePermission() {
String var59D1027D8312A72F6CBAE99932E8098B_1901620803 =         mWritePermission;
        var59D1027D8312A72F6CBAE99932E8098B_1901620803.addTaint(taint);
        return var59D1027D8312A72F6CBAE99932E8098B_1901620803;
        // ---------- Original Method ----------
        //return mWritePermission;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:14.071 -0400", hash_original_method = "A803A7F07F4B7A6BE15492168684C07E", hash_generated_method = "7B7018DD15BB7E9DC32C95019CC04DA6")
    public void writeToParcel(Parcel dest, int flags) {
        addTaint(flags);
        addTaint(dest.getTaint());
        super.writeToParcel(dest, flags);
        dest.writeString(mReadPermission);
        dest.writeString(mWritePermission);
        // ---------- Original Method ----------
        //super.writeToParcel(dest, flags);
        //dest.writeString(mReadPermission);
        //dest.writeString(mWritePermission);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:47:14.071 -0400", hash_original_field = "BF769DDFB95FE3C86E626C9171120430", hash_generated_field = "B147657571B9F640821DBBF9A7AC44F7")

    public static final Parcelable.Creator<PathPermission> CREATOR
            = new Parcelable.Creator<PathPermission>() {
        public PathPermission createFromParcel(Parcel source) {
            return new PathPermission(source);
        }

        public PathPermission[] newArray(int size) {
            return new PathPermission[size];
        }
    };
    // orphaned legacy method
    public PathPermission createFromParcel(Parcel source) {
            return new PathPermission(source);
        }
    
    // orphaned legacy method
    public PathPermission[] newArray(int size) {
            return new PathPermission[size];
        }
    
}

