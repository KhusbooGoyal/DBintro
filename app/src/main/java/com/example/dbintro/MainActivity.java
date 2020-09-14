package com.example.dbintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        Log.d("DB Count: ", String.valueOf(db.getContactCount()));

        //Insert contacts
        Log.d("Insert: ", "Inserting.... ");
        db.addContact(new Contact("Khusboo", "123456"));
        db.addContact(new Contact("Vishu", "468584"));
        db.addContact(new Contact("Udit", "837555"));
        db.addContact(new Contact("Sweety", "i48665"));

        //Read Them Back
        Log.d("Reading: ", "Reading all contacts...");
        List<Contact> contactList = db.getAllContacts();

        //Get one contact
       // Contact oneContact = db.getContact(2);
//        oneContact.setName("Khusboooooo");
//        oneContact.setPhoneNumber("000000");
//
//        //Updated contact
//        int newContact = db.updateContact(oneContact);
//
//        Log.d("One Contact: ","Updated row: "+ String.valueOf(newContact)+  " Name: "+oneContact.getName() +"Phone: "+oneContact.getPhoneNumber());

       // db.deleteContact(oneContact);
        for (Contact c :contactList) {
            String log = "ID: " + c.getId()+ " , Name: "+c.getName()+" , Phone: "+c.getPhoneNumber();
            Log.d("Name:" , log);
        }
    }
}
