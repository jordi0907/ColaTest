import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {
    Queue<Integer> q;
    Queue<String> q2;

    @Before
    public void setUp() throws Exception {
        this.q = new QueueImpl<Integer>(5);
        this.q.push(1);
        this.q.push(2);
        this.q.push(3);
        this.q2 = new QueueImpl<String>(5);
        this.q2.push("1");
        this.q2.push("2");
        this.q2.push("3");
    }

    @After
    public void tearDown(){
        this.q2 = null;
    }

    @Test
    public void testPush() throws Exception {
        Assert.assertEquals(3, this.q2.size());
        this.q2.push("4");
        Assert.assertEquals(4, this.q2.size());
        this.q2.push("5");
    }

    @Test
    public void testPush2() throws Exception {
        Assert.assertEquals(3, this.q2.size());
        this.q2.push("4");
        this.q2.push("5");
        Assert.assertEquals(5, this.q2.size());
    }

    @Test
    public void testPushInteger() throws Exception {
        Assert.assertEquals(3, this.q.size());
        this.q.push(4);
        Assert.assertEquals(4, this.q.size());
    }

    @Test(expected = FullQueueException.class)
    public void tetPushFull() throws FullQueueException {
        Assert.assertEquals(3, this.q2.size());
        this.q2.push("4");
        this.q2.push("5");
        this.q2.push("6");
        Assert.assertEquals(5, this.q2.size());


    }

    @Test
    public void testPop() throws EmptyQueuException {
        Assert.assertEquals(3, this.q2.size());
        String quitado = this.q2.pop();
        Assert.assertEquals(2, this.q2.size());
        Assert.assertEquals("1", quitado);
    }
}
