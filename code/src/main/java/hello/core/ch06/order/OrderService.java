package hello.core.ch06.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
