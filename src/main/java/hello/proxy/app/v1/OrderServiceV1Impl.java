package hello.proxy.app.v1;

public class OrderServiceV1Impl implements OrderServiceV1{

    private final OrderRepositroyV1 orderRepositroy;

    public OrderServiceV1Impl(OrderRepositroyV1 orderRepositroy) {
        this.orderRepositroy = orderRepositroy;
    }

    @Override
    public void orderItem(String itemId) {
        orderRepositroy.save(itemId);
    }

}
