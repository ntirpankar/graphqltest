package com.myriad.graphqltest.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.myriad.graphqltest.dao.AuthorDao;
import com.myriad.graphqltest.models.Author;
import com.myriad.graphqltest.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostResolver implements GraphQLResolver<Post> {

    @Autowired
    private AuthorDao authorDao;

    public Author getAuthor(Post post) {
        return authorDao.getAuthorById(post.getAuthorId());
    }
}
