package com.blackjack.domain

import main.scala.com.blackjack.anyval.DealerId
import main.scala.com.blackjack.domain.Hand

case class Dealer(id: DealerId, hand: Hand) {
  def hit(card: Card): Hand = hand.addCard(card)
  // do we want to store Deck here? NO
  // Then, how to implement function which will take cards until score >= 17?
//  def hitUntil(card: Card): Hand = {
//    if (hand.score >= 17) {
//      hand
//    } else {
//
//    }
//  }
}
