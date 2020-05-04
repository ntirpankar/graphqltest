package com.myriad.graphqltest.dao;

import com.myriad.graphqltest.models.Author;

import java.util.ArrayList;
import java.util.Arrays;

public class AuthorDao {

    public Author getAuthorById(String id){
        Author retVal = new Author();

        retVal.setId(id);
        retVal.setName("Shakespeare Number " + id);
        retVal.setThumbnail("Thumbnail.png");
        retVal.setPostIds(new ArrayList<String>(Arrays.asList("1", "2", "3")));

        return retVal;
    }
}
