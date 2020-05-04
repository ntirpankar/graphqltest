package com.myriad.graphqltest;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.myriad.graphqltest.dao.PostDao;
import com.myriad.graphqltest.models.Post;

import java.util.List;

public class Query implements GraphQLResolver {
    private PostDao postDao;
    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
