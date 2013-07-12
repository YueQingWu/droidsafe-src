package android.animation;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

public class IntEvaluator implements TypeEvaluator<Integer> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:46:33.299 -0400", hash_original_method = "2EF7111110D38FEB0992107126625CBA", hash_generated_method = "2EF7111110D38FEB0992107126625CBA")
    public IntEvaluator ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:46:33.301 -0400", hash_original_method = "6401BD46F7D1EA9F5782F720B53B51D0", hash_generated_method = "0E7B45A0699C330341EACEF831779523")
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        addTaint(endValue.getTaint());
        addTaint(startValue.getTaint());
        addTaint(fraction);
        int startInt = startValue;
Integer varC552D327F4C770F40BF1C1A41BA4F5AE_423937950 =         (int)(startInt + fraction * (endValue - startInt));
        varC552D327F4C770F40BF1C1A41BA4F5AE_423937950.addTaint(taint);
        return varC552D327F4C770F40BF1C1A41BA4F5AE_423937950;
        // ---------- Original Method ----------
        //int startInt = startValue;
        //return (int)(startInt + fraction * (endValue - startInt));
    }

    
}

