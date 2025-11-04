

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void checkAddComments()
    {
        SalesItem salesIte1 = new SalesItem("bob", 1);
        assertEquals(true, salesIte1.addComment("a", "a", 1));
        assertEquals(false, salesIte1.addComment("a", "b", 2));
    }


    @Test
    public void checkUpvoteDownvote()
    {
        Comment comment1 = new Comment("a", "a", 1);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        assertEquals(3, comment1.getVoteCount());
        comment1.downvote();
        assertEquals(2, comment1.getVoteCount());
    }
}



