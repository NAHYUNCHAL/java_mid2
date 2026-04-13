package tutor.d4_10.step1;

public class Menu {
    private String name;
    private int price;
    private int discountRate;
    private boolean isAvailable = true;

    public Menu(String name, int price, int discountRate ) {

        this.name = name;
        if (price <= 0 ) {
            throw new IllegalArgumentException("0원 미만은 가격을 변경하면 안됩니다.");
        }
        this.price = price;
        if (discountRate > 50) {
            throw new IllegalArgumentException("50%를 초과하는 할인을 적용할수 없습니다.");
        } else if (discountRate >= 0 && discountRate <= 50) {
            this.discountRate = discountRate;
        } else {
            throw new IllegalArgumentException("범위를 충족하지 못하는 할인을 적용할수 없습니다.");
        }



    }

    public void changePrice(int price) {
        if (!isAvailable) {
            throw new IllegalArgumentException("sold out 이라 생성 안됨");
        }
        if (price <= 0 ) {
            throw new IllegalArgumentException("0원 미만은 가격을 변경하면 안됩니다.");
        }
        this.price = price;
    }


    public void applyDiscount(int discountRate) {
        if (!isAvailable) {
            throw new IllegalArgumentException("sold out 이라 생성 안됨");
        }
        if (discountRate > 50) {
            throw new IllegalArgumentException("50%를 초과하는 할인을 적용할수 없습니다.");
        } else if (discountRate >= 0 && discountRate <= 50) {
            this.discountRate = discountRate;
        }else {
            throw new IllegalArgumentException("범위를 충족하지 못하는 할인을 적용할수 없습니다.");
        }

    }

    public int getDiscountRate() {
        return discountRate;
    }


    public int getPrice() {
        return price;
    }

    public void makeSoldOut() {
        this.isAvailable = false;// sold out
    }

}
