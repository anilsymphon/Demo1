package com.company;
public class Logic1 {
    public boolean squirrelPlay(int temp, boolean isSummer) {
      if(temp>=60 && temp<=90){
          return true;
      }
      else if(( temp>=60 && temp <=100) && isSummer){
          return true;
      }
      return false;
    }
public static void main (String[] args){
        Logic1 L = new Logic1();
    System.out.println(L.squirrelPlay(95, true));
}
}