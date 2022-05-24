package lotto

data class LottoTicket(val numbers: List<Int>) {

    fun matchCountWith(other: LottoTicket): Int {
        return numbers.intersect(other.numbers).size
    }

    fun hasNumber(number: Int): Boolean {
        return numbers.contains(number)
    }
}
