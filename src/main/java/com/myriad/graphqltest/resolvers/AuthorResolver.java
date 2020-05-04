package com.myriad.graphqltest.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.myriad.graphqltest.dao.PostDao;
import com.myriad.graphqltest.models.Author;
import com.myriad.graphqltest.models.Post;

import java.util.List;

public class AuthorResolver implements GraphQLResolver<Author> {
    private PostDao postDao;

    public List<Post> getPosts(Author author) {
        return postDao.getPostByAuthorId(author.getId());
    }
}
