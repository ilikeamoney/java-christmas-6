package christmas;

import java.util.HashMap;
import java.util.Map;

public class ValidateEventDay {

    private Map<Integer, String> event;

    public void init() {

    }


    public static int checkDayDiscount(int day) {
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
}
