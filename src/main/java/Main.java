public class Main {
    public static void main(String[] args) throws FullQueueException, EmptyQueuException {
        Queue<String> q = new QueueImpl<String>(5);
        q.push("1");
        q.push("2");
        System.out.println("push" +q);

        System.out.println("pop quitado: " +q.pop());
        System.out.println("pop" +q);
        System.out.println("size: " +q.size());
    }
}
