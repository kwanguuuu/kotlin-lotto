package lotto

import java.lang.RuntimeException

class LottoPurchase {

    fun buyLotto(money: Int): List<Lotto> {
        moneyValidate(money)
        val numberOfBuy = money / LOTTO_PRICE

        return List(numberOfBuy) { Lotto() }
    }

    private fun moneyValidate(money: Int) {
        if (money < LOTTO_PRICE) {
            throw RuntimeException("로또 구매 비용이 부족합니다. - `$money` (최소`$LOTTO_PRICE` 이상 필요)")
        }
    }

    companion object {
        private const val LOTTO_PRICE = 1_000
    }
}
