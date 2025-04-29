package christmas;

/**
 *  * <애피타이저>
 *  * 양송이수프(6,000), 타파스(5,500), 시저샐러드(8,000)
 *  *
 *  * <메인>
 *  * 티본스테이크(55,000), 바비큐립(54,000), 해산물파스타(35,000), 크리스마스파스타(25,000)
 *  *
 *  * <디저트>
 *  * 초코케이크(15,000), 아이스크림(5,000)
 *  *
 *  * <음료>
 *  * 제로콜라(3,000), 레드와인(60,000), 샴페인(25,000)
 */

public class MenuRepository {

    private final String[] appetizerMenuName = {"양송이수프", "타파스", "시저샐러드"};
    private final Integer[] appetizerMenuPrice = {6000, 5500, 8000};

    private final String[] mainMenuName = {"티본스테이크", "바비큐립", "해산물파스타", "크리스마스파스타"};
    private final Integer[] mainMenuPrice = {55000, 54000, 35000, 25000};

    private final String[] dessertMenuName = {"초코 케이크", "아이스크림"};
    private final Integer[] dessertMenuPrice = {15000, 5000};

    private final String[] beverageName = {"제로콜라", "레드와인", "삼페인"};
    private final Integer[] beveragePrice = {3000, 60000, 25000};
}
