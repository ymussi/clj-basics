(ns tutorial.operators
  (:gen-class))

(defn operators []
  "aritimetics"
  (def sum (+ 2 3))
  (def sub (- 2 3))
  (def mult (* 2 3))
  (def div (/ 2 3))
  (def a (min 2 3 1))
  (def b (max 3 7 5))
  (def c (rem 3 7))
  (def d (inc 3))
  (def e (dec 3))

  (println sum)
  (println sub)
  (println mult)
  (println div)
  (println a)
  (println b)
  (println c)
  (println d)
  (println e)

  "relational"
  (def equal (= 2 2))
  (def nequal (not= 2 2))
  (def minor (< 2 3))
  (def minorequal (<= 3 2))
  (def maior (> 5 2))
  (def maiorequal (>= 2 5))

  (println equal)
  (println nequal)
  (println minor)
  (println minorequal)
  (println maior)
  (println maiorequal)

  "logical"

  (def AND (and true false))
  (def OR (or true false))
  (def NOT (not true))

  (println AND)
  (println OR)
  (println NOT)

  "operators precedence"
  ; 2 + 5 / 3 - 1

  (def op (-(/(+ 2 5)3)1))

  (println op)

  )

(operators)
