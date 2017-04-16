package com.niall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
/**
 *
 * @author niall
 * This connects to a Yahoo API for the latest conversion rates
 */
public class ExchangeRate {
     private double getRate(String from, String to) {
        try {
            URL url = new URL("http://quote.yahoo.com/d/quotes.csv?f=l1&s=" + from + to + "=X");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            if (line.length() > 0) {
                return Double.parseDouble(line);
            }
            reader.close();
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }
    public double getEuroUsdRate(){
        return getRate("EUR", "USD");
    }
    public double getUsdEuroRate(){
        return getRate("USD", "EUR");
    }
    public double getEuroGBPRate(){
        return getRate("EUR", "GBP");
    }
    public double getGBPEuroRate(){
        return getRate("GBP", "EUR");
    }
     
}
