package com.blackjack.domain

import com.blackjack.anyval.GameId

case class Game(id: GameId, dealer: Dealer, player: Player)
