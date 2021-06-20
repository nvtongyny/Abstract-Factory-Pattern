public class OrderCommand implements Command{
    private Operator receiver;
    private Order order;
    public OrderCommand(Operator receiver,Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getId()+"�Ź˿͵Ķ���");
        receiver.MarkFruit(order);
    }
}
