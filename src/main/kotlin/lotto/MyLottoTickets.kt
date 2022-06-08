package lotto

class MyLottoTickets(
    val manualLottery: List<LottoTicket> = listOf(),
    val autoLottery: List<LottoTicket> = listOf(),
) {
    private val lottoTickets: List<LottoTicket> = manualLottery + autoLottery

    fun getMyLottoResult(lastWinningLotto: LastWinningLotto): MyLottoResult {
        val eachCount: Map<LottoWinnerRank, Int> = lottoTickets
            .map { getRanking(it, lastWinningLotto) }
            .groupingBy { it }
            .eachCount()

        return MyLottoResult(eachCount)
    }

    private fun getRanking(targetLotto: LottoTicket, winningLotto: LastWinningLotto): LottoWinnerRank {
        val matchNumberCount = winningLotto.matchCount(targetLotto)
        val hasBonusNumber = winningLotto.hasBonusNumber(targetLotto)
        return LottoWinnerRank.of(matchNumberCount, hasBonusNumber)
    }
}
