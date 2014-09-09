package org.example.server;

import org.springframework.stereotype.Service;

/**
 * Created by amits on 08/09/14.
 */
@Service(value = "multiplier")
public class Treble implements Multiplier {

    public int multiply(final int originalNumber) {
        return originalNumber * 3;
    }

}