package edu.pcc.cis233j.countries;

import java.util.List;

/**
 * Read from the Country database and print data on the countries
 *
 * @author Brian Hurst
 * @version 2018.02.06
 * <p>
 * - Modified main method to use a for each loop to list all countries
 * - Modified main method
 */
public class Main {
    public static void main(String[] args) {
        CountryDB cdb = new CountryDB();
        List<Country> countries = cdb.getCountries();
        for (Country country : countries) {
            System.out.println("Country: ");
            System.out.println("Name: " + country.getName()
                    + "  Population: " + country.getPopulation()
                    + "  Median Age: " + country.getMedianAge()
                    + "  Languages: " + country.getCountryLanguages());
        }

    }
}
