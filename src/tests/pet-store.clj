(ns tests.pet-store
  (:require  [clojure.test :refer [deftest is testing]]))

(defn petToHumanAge
  "this function compare a human age to the pet age"
  [x]
  (def petStore {"dog" 7, 'cat 5, "goldfish" 10})
  (get petStore x))

(defn age
  "This function returns a pet age"
  [petName petType petAge]
  (def calc (petToHumanAge petType))
  (println "The" petType petName "is" (* calc petAge) "years old in human years"))

(age "Pingo" "dog" 1)
(age "Cabeção" 'cat 2)
(age "Dourado" "goldfish" 1)
