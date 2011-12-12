(ns tic-tac-toe-console.computer-spec
	(:use
    [speclj.core]
    )
  (:require
    [tic-tac-toe-console.utilities :as utilities]
	  [tic-tac-toe-console.computer :as computer]
    )
  )

(describe "get-computer-type"

  (it "repeats until a valid computer type is given"
  	(with-in-str (apply str (interleave '(0 4 5 1) (repeat "\n")))
  		(should= 1 (utilities/eat-output (computer/get-computer-type 0)))
  		)
  	)

  (it "gets the computer type from the user"
  	(with-in-str (apply str (interleave '(1) (repeat "\n")))
  		(should= 1 (utilities/eat-output (computer/get-computer-type 0)))
  		)
  	)

  )

(run-specs)