package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    List<String>  phoneBook;
    Map<String,List<String> > map;

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
        }

    public PhoneBook() {

        this.phoneBook= new ArrayList<String>();
        this.map= new LinkedHashMap<>();


    }

    public void add(String name, String phoneNumber) {
        this.phoneBook.add(phoneNumber);
        this.map.put(name, this.phoneBook);
    }

    public void addAll(String name, String... phoneNumbers) {
         this.phoneBook.addAll(Arrays.asList(phoneNumbers));
       this.map.put(name,this.phoneBook) ;
    }

    public void remove(String name) {
        this.map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return this.phoneBook.contains(name);
    }

    public List<String> lookup(String name) {
       return  this.phoneBook;
    }

    public String reverseLookup(String phoneNumber)  {

        for (String number:this.phoneBook) {
            if (number.equals(phoneNumber)){
                for (String name:this.getMap().keySet()){
                    return name;

                }
            }

        }

        return null;
    }

    public List<String> getAllContactNames() {
        List<String> listOfNames = new ArrayList<>();
        for (String name : this.map.keySet()){
            listOfNames.add(name);
        }
          return listOfNames;
    }

    public Map<String, List<String>> getMap() {
        return this.map;
    }


}
