package hello.core.ch07.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
