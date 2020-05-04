package com.myriad.graphqltest;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.myriad.graphqltest.dao.PostDao;
import com.myriad.graphqltest.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private PostDao postDao;

    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
