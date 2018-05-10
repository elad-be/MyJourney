package com.example.user.myjourney;

import java.util.ArrayList;

/**
 * Created by user on 5/10/18.
 */

public class Grid {

    //    public String uid, time, date, postimage, description, fullname;
    public String name;

    public String id;

    public ArrayList<Post> posts;

    public Grid(String name, ArrayList<Post> posts) {
        this.name = name;
        this.posts = posts;
        this.id = "Test";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

}
