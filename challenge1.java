package com.hcl2;
import java.util.Scanner;
class Country{
    private String countrycode;
    private String countryname;
    Country(String countrycode,String countryname){
        this.countrycode=countrycode;
        this.countryname=countryname;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountryname() {
        return countryname;
    }
}
class CountryBo{
    public Country createCountry(String data){

    }
        }
        class Airport{
         private String airportname;
         private String country;
         Airport(String airportname,String country){
             this.airportname=airportname;
             this.country=country;
         }

            public void setAirportname(String airportname) {
                this.airportname = airportname;
            }

            public String getAirportname() {
                return airportname;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getCountry() {
                return country;
            }
        }
        class AirportBo{
            public Airport createAirport(String data,Country[] countryList)	{

            }
            public String findCountryName(Airport[] airportList, String airportname){

            }
            public Boolean findWhetherAirportsAreInSameCountry (Airport[] airportList, String airportname1, String airportname2){

            }

        }
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       String countrycode;
       String countryname;
       String airportname;
       String country;
        System.out.println("enter the country count:");
        int count=in.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println("enter the country"+ i + "details");
            Country con=new Country(countrycode,countryname);
        }
        System.out.println("enter the airport name:")
                int airportcount=in.nextInt();
        for(int i=1;i<=airportcount;i++){
            System.out.println("enter the airport " + i "details");
            Airport air=new Airport(airportname,country);
        }
    }
}
