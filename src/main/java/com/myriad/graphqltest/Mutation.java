package com.myriad.graphqltest;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.myriad.graphqltest.dao.PostDao;
import com.myriad.graphqltest.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
        @Autowired
        private PostDao postDao;

        public Post writePost(String title, String text, String category) {
            return postDao.savePost(title, text, category);
        }
}
