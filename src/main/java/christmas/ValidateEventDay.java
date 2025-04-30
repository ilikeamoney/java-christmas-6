package christmas;

import java.util.HashMap;
import java.util.Map;

public class ValidateEventDay {

    private Map<Integer, String> event;

    public void init() {
        setEvent();
    }


    // 날짜 할인
    public int checkDayDiscount(int day) {
        if (day < 1 || 25 < day) {
            throw new IllegalArgumentException("");
        }

        int christmas = 25;
        int discountMoney = 100;
        int baseDiscountMoney = 1000;
        int totalDisCountMoney = 0;
        int calculatorDay = christmas - (christmas - day);

        totalDisCountMoney = baseDiscountMoney + (calculatorDay * discountMoney) - 100;

        return totalDisCountMoney;
    }

    // 날짜, 메뉴 할인
    public int checkDishDisCount(String date, int cnt) {
        if (date != null) {
            return mainMenuDiscount(cnt);
        }

        return dessertMenuDiscount(cnt);
    }

    private int mainMenuDiscount(int cnt) {
        return Discount.DATE_DISCOUNT.getValue() * cnt;
    }

    private int dessertMenuDiscount(int cnt) {
        return Discount.DATE_DISCOUNT.getValue() * cnt;
    }

    // 특별일 할인
    private boolean checkSpecialDay(int day) {
        return switch (day) {
            case 3, 17, 10, 24, 25, 31 -> true;
            default -> false;
        };
    }

    // 증정 이벤트
    private boolean checkGiftEvent(int money) {
        if (money >= Discount.GIFT_EVENT.getValue()) {
            return true;
        }

        return false;
    }

    // TODO 총혜택 금액에 따라 다른 이벤트 배지를 부여합니다. 이 배지는 2024 새해 이벤트에서 활용할 예정입니다. 배지에 따라 새해 이벤트 참여 시, 각각 다른 새해 선물을 증정할 예정입니다.

    private void setEvent() {
        event = new HashMap<>();
        event.put(1, "금요일");
        event.put(2, "토요일");
        event.put(8, "금요일");
        event.put(9, "토요일");
        event.put(15, "금요일");
        event.put(16, "토요일");
        event.put(22, "금요일");
        event.put(23, "토요일");
        event.put(29, "금요일");
        event.put(30, "토요일");
    }


    public Map<Integer, String> getEvent() {
        return event;
    }
}
