package com.blackjack.domain

import main.scala.com.blackjack.anyval.{Rank, Suit}

case class Card(rank: Rank, suit: Suit) {
  override def toString: String = s"Card: rank - ${rank.value}, suite - $suit"
}
