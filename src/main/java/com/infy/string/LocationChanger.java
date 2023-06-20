package com.infy.string;

public class LocationChanger {
    public String location;
    public String name;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkCity()
    {
        String place2 = location.split(",")[1];
        if(place2.equals("Delhi"))
        {
            System.out.println("Welcome to Infy Mysore Delhites!");
        }
        else if(place2.equals("Trivandrum"))
        {
            System.out.println("Welcome to MyDC people of Trinfy!!");
        }
        else if(place2.equals("Bhubaneshwar"))
        {
            System.out.println("You came a long way down South! We welcome you!");
        }
        else
        {
            System.out.println("Oops your city name is not listed");
        }
    }
    public void editAddress()
    {
      String place = location.split(",")[2];
      if(place.equals("STP"))
          System.out.println("Your location has been changed from STP to SEZ");
      else
          System.out.println("Your location remains the same!");
    }
    public void welcomeEmployee()
    {
        System.out.println("Hello "+name.split(" ")[0]);
    }
}
