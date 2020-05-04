package com.myriad.graphqltest.dao;

import com.myriad.graphqltest.models.Post;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostDao {

    public List<Post> getRecentPosts(int count, int offset){
        List<Post> retVal = new ArrayList<>();

        for(Integer i=offset; i < count; i++){
            Post newPost = new Post();
            newPost.setId(i.toString());
            newPost.setTitle("My title is" + i.toString());
            newPost.setCategory("Internet Comments:" + i.toString());
            newPost.setText("The text " + i.toString());
            newPost.setAuthorId(i.toString());

            retVal.add(newPost);
        }

        return retVal;
    }

    public List<Post> getPostByAuthorId(String id){
        List<Post> retVal = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Post newPost = new Post();
            newPost.setId(id);
            newPost.setTitle("My title is" + id);
            newPost.setCategory("Internet Comments:" + id);
            newPost.setAuthorId(id);
            retVal.add(newPost);
        }

        return retVal;
    }

    public Post savePost(String title, String text, String category) {
        Post newPost = new Post();
        newPost.setId("1");
        newPost.setAuthorId("2");
        newPost.setTitle(title);
        newPost.setText(text);
        newPost.setCategory(category);
        return newPost;
    }
}
