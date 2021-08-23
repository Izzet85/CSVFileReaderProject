package com.company;

import com.company.airports.Airports;
import com.company.countries.Countries;
import com.company.runways.RunWays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {




    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
String [] newArray = new String[0];
        RunWays reunway = new RunWays(newArray);
       reunway.CSVreaderRunways();

//        Airports airports = new Airports();
//        airports.CSVreaderAirports();
//
//        Countries countries = new Countries();
//        countries.CSVreaderCountries();






    }
}