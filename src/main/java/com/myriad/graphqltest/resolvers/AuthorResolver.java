package com.myriad.graphqltest.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.myriad.graphqltest.dao.PostDao;
import com.myriad.graphqltest.models.Author;
import com.myriad.graphqltest.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorResolver implements GraphQLResolver<Author> {

    @Autowired
    private PostDao postDao;

    public List<Post> getPosts(Author author) {
        return postDao.getPostByAuthorId(author.getId());
    }
}
