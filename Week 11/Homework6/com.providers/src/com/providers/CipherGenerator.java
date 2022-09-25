package com.providers;

import com.services.Cipherable;

public class CipherGenerator {

    public static Result countDistinct(Cipherable cipher, int seed) {
        char[] chars = cipher.getSecretChars(seed);
        int data = 1;
        Result result = new Result(chars, data);

        for (int i = 1; i < chars.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (chars[i] == chars[j])
                    break;
            }
            if (i == j)
               data++;
        }
        return result;
    }
}
