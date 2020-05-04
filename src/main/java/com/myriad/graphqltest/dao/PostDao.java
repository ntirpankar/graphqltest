package com.myriad.graphqltest.dao;

import com.myriad.graphqltest.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostDao {

    public List<Post> getRecentPosts(int count, int offset){
        List<Post> retVal = new ArrayList<>();

        for(Integer i=offset; i < count; i++){
            Post newPost = new Post();
            newPost.setId(i.toString());
            newPost.setTitle("My title is" + i.toString());
            newPost.setCategory("Internet Comments:" + i.toString());
            //newPost.setAuthorId("Nothing");

            retVal.add(newPost);
        }

        return retVal;
    }

    public List<Post> getPostByAuthorId(String id){
        List<Post> retVal = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Post newPost = new Post();
            newPost.setId(id.toString());
            newPost.setTitle("My title is" + id.toString());
            newPost.setCategory("Internet Comments:" + id.toString());
            newPost.setAuthorId(id);
            retVal.add(newPost);
        }

        return retVal;
    }
}
