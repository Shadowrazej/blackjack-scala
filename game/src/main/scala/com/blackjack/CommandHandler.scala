package main.scala.com.blackjack

import main.scala.com.blackjack.domain.Command

class CommandHandler {
  def handle(command: Command): Unit = {
    command match {
      case Command.StartGame(gameId) => ???
      case Command.PlaceBet(gameId, playerId, amount) => ???
      case Command.CloseBets(gameId) => ???
      case Command.AcceptBets(gameId, playerId) => ???
      case Command.ResolveGame(gameId, gameResult) => ???
      case _ => new RuntimeException(s"No implementation for provided command ${command.toString}")
    }
  }
}
