(ns tutorial.namespaces
  (:require [clojure.string :as str]
            [tests.car-dealership :as cars]))

(defn -main
  [budgest code]
  (cars/getCarPrices budgest code ))

(-main 60000 "20percent")
