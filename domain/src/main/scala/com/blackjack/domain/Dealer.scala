package com.blackjack.domain

import main.scala.com.blackjack.anyval.DealerId
import main.scala.com.blackjack.domain.Hand

case class Dealer(id: DealerId, hand: Hand)
