package hello.core.ch03.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
