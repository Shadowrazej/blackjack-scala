package com.blackjack.domain

import com.blackjack.anyval.PlayerId
import main.scala.com.blackjack.anyval.BetAmount
import main.scala.com.blackjack.domain.Hand

case class Player(id: PlayerId, balance: Balance, hand: Hand) {
  def bet(amount: BetAmount): Either[BalanceError, Balance] = {
    balance.withdraw(amount.value)
  }
}
