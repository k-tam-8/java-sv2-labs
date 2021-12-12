package enumabstract;

public enum Discount {
    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return (price * pieces) * 20 / 100;
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces < 3) {
                return (price * pieces) * 25 / 100;
            } else
                return (price * (pieces - 1) * 25 / 100) + price / 2;
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
