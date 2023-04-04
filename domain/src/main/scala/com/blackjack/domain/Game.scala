package com.blackjack.domain

import com.blackjack.anyval.GameId

case class Game(id: GameId, dealer: Dealer, player: Player) {
  val deck: Deck = Deck()

  def startRound() = {
//    player.bet()
    // closeBets() - is it function for Table?

    // Deal the Cards
    // player.hand = deck.dealTopCard()
    // player.hand = deck.dealTopCard()
  }
  // some intermediate state, when player decides what to do: hit, double down, split, stand
  def playerDecision() = ???
  // some state, where we should evaluate hands and evaluate the winners
  def endRound() = ???
}
