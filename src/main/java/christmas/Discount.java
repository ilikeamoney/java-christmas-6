package christmas;

public enum Discount {

    DATE_DISCOUNT(2023), GIFT_EVENT(120000);

    final int value;

    Discount(int discount) {
        value = discount;
    }


    public int getValue() {
        return value;
    }
}
