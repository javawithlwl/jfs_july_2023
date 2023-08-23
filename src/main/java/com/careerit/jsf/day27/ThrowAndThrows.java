package com.careerit.jsf.day27;

import java.io.IOException;
import java.util.List;

public class ThrowAndThrows {

        // throw : is used to throw an exception explicitly
        // throws : is used to declare an exception in method signature

        double balance=9763;
        public void withDraw(double amount){
            if(amount > balance){
                throw new InsufficientFundsException("Amount can't be negative");
            }
            // With draw logic
        }
        public List<String> readDataFromFile(String fileName) throws IOException {
            // Read the data from file and return the data
            return null;
        }
}
