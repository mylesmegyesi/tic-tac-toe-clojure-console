(ns tic-tac-toe-console.user
  (:require
    [tic-tac-toe.players :as players]
    [tic-tac-toe.board :as board]
    [tic-tac-toe-console.utilities :as utilities]
    )
  )

(defn get-user-move [player board]
	(utilities/get-input (str (players/get-player-name player) ", please enter your move (ex: 1 1, for row 1 column 1): ") utilities/get-index (fn [move] (board/valid-move board move)) "That is not a valid move, please try again.")
	)

(defn get-user-mover [game-state-fn player]
  get-user-move
  )