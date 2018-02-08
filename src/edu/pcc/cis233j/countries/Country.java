package edu.pcc.cis233j.countries;

import java.util.ArrayList;
import java.util.List;

/**
 * A country in the world
 *
 * @author Brian Hurst & Cara Tang
 * @version 2018.02.06
 * <p>
 * - Added ArrayList class
 * - Added List class
 * - Added field countrylanguages
 * - Added  addCountryLanguage method
 * - Added getCountryLanguages method
 * - Modified Constructor to create object for country languages
 */
public class Country {
    private int id;
    private String name;
    private long population;
    private double medianAge;
    private List<String> languages; // stores the country languages

    /**
     * Create a Country object with the given properties
     */
    public Country(int id, String name, long population, double medianAge) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.medianAge = medianAge;
        languages = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public double getMedianAge() {
        return medianAge;
    }

    /**
     * Add a language to this country's list of languages
     *
     * @param newLanguage the language to be added to the country
     */
    public void addCountryLanguage(String newLanguage) {
        languages.add(newLanguage);
    }

    /**
     * @return the list of languages for this country
     */
    public List<String> getCountryLanguages() { return languages; }

}
