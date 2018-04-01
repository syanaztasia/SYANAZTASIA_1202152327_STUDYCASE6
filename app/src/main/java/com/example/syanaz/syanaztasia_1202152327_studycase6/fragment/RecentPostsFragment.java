package com.example.syanaz.syanaztasia_1202152327_studycase6.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by Syanaz on 4/1/2018.
 */

public class RecentPostsFragment extends PostListFragment {
    public RecentPostsFragment(){}

    @Override

    public Query getQuery(DatabaseReference databaseReference) {

        // [START recent_posts_query]

        // Last 100 posts, these are automatically the 100 most recent

        // due to sorting by push() keys

        Query recentPostsQuery = databaseReference.child("posts")

                .limitToFirst(100);

        // [END recent_posts_query]



        return recentPostsQuery;

    }
}
