package lotto.model;

public class LottoNumber {
    private final Integer number;

    public LottoNumber(Integer number) {
        validateRange(number);
        this.number = number;
    }


    private void validateRange(Integer number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException("[ERROR] 로또 번호의 숫자 범위는 1~45까지여야 한다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof LottoNumber) {
            return o.equals(number);
        }
        return number.equals(o);
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }

}
