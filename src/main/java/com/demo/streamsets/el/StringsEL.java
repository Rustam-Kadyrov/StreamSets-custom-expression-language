package com.demo.streamsets.el;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

@ElDef
public class StringsEL {

    @ElFunction(
            prefix = "extraString",
            name = "reverseOrder",
            description = "Returns string in reverse order"
    )
    public static String reverseOrder(@ElParam("string") String string) {
        StringBuilder result = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }
}
