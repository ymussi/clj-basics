(ns tutorial.conditionals
  (:gen-class))

(defn CondIf []
  (println "\nCondIf:")
  (if (= 5 5)
    (println "equal")
    (println "not eqaual")))

(CondIf)

(defn CondIfDo []
  (println "\nCondIfDo:")
  (if (= 5 5)
    (do (println "equal first statement")
        (println "second statement"))
    (do (println "not equal first statement")
        (println "second statement"))))

(CondIfDo)

(defn CondNestedIf []
  (println "\nCondNestedIf:")
  (if (and (= 5 5) (= 2 3))
    (println "true")
    (println "false")))

(CondNestedIf)

(defn CondNestedIf2 []
  (println "\nCondNestedIf2:")
  (if (and (= 5 5) (or (= 2 2) not true))
    (println "true")
    (println "false")))

(CondNestedIf2)

(defn CondCase
  [pet]
  (println "\nCondCase:")
  (case pet
    "cat" (println "I have a Cat")
    "dog" (println "I have a Dog")
    "fish" (println "I have a GoldFish")))

(CondCase "fish")

(defn CondCond
  [amount]
  (println "\nCondCond:" amount)
  (cond
    (<= amount 2) (println "few")
    (<= amount 10) (println "several")
    (<= amount 100) (println "many")
    :else (println "loads")))

(CondCond 20)
