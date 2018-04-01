package com.example.syanaz.syanaztasia_1202152327_studycase6.model;

/**
 * Created by Syanaz on 4/1/2018.
 */

import com.google.firebase.database.IgnoreExtraProperties;
@IgnoreExtraProperties

public class User {

    public String username;

    public String email;



    public User() {

        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }



    public User(String username, String email) {

        this.username = username;

        this.email = email;

    }
}
