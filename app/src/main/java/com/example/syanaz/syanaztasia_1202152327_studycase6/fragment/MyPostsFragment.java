package com.example.syanaz.syanaztasia_1202152327_studycase6.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by Syanaz on 4/1/2018.
 */

public class MyPostsFragment extends PostListFragment{

    public MyPostsFragment() {}



    @Override
    public Query getQuery(DatabaseReference databaseReference) {

        // All my posts

        return databaseReference.child("user-posts")

                .child(getUid());

    }
}
