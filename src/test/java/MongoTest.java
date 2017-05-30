import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import net.Application;
import net.coderdaily.bean.Post;
import net.coerdaily.post.dao.PostRepostitory;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MongoTest {
    @Autowired
    private PostRepostitory postRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void testList() {
        postRepository.save(new Post("ddd",new Date()));

        Post post = postRepository.findByTitle("aaa");
        System.out.println(post);


        List<Post> post2 = postRepository.findAll();
        System.out.println(post2);

        List<Post> post3 = mongoTemplate.findAll(Post.class);
        System.out.println(post3);
    }
}
