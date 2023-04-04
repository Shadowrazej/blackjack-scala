package com.blackjack.domain

import com.blackjack.anyval.PlayerId
import main.scala.com.blackjack.anyval.BetAmount
import main.scala.com.blackjack.domain.Hand

// Hmm, not logical to store HAND in Player constructor. Why?
// Because if player wants make a bet Player().bet(123) it means, that he already has some Hand.
// But, we can set Default Hand as NiL / empty
case class Player(id: PlayerId, balance: Balance, hand: Hand) {
  def bet(amount: BetAmount): Either[BalanceError, Balance] = {
    balance.debit(amount.value)
  }
  def hit(card: Card): Hand = hand.addCard(card)
  def stand = ???
  def doubleDown(card:Card): Hand = {
    // how to store betAmount for player and where?
//    balance.debit()
//    balance.debit()
    hand.addCard(card)
    // prevent another operations after Double Down
  }
}
