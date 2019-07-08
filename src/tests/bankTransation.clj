(ns tests.bankTransation)

(def buyerAccount (ref 100))
(def merchantAccount (ref 0))
(def prices {'pen 1, 'notebook 5, 'backpack 10})
(def items (ref []))

(defn printInfo
  []
  (println "\nPrintInfo:")
  (println "buyerAccount:" @buyerAccount)
  (println "merchantAccount:" @merchantAccount )
  (println "itemns:" @items))

(printInfo)

(defn buy
  [item]
  (def itemPrice (get prices item))
  (if (<= itemPrice @buyerAccount)
    (dosync
     (ref-set merchantAccount (+ @merchantAccount itemPrice))
     (ref-set buyerAccount (- @buyerAccount itemPrice))
     (def newItems (cons item @items))
     (ref-set items newItems))
    (println "insuficient founds"))
  (printInfo))

(buy 'pen)
(buy 'notebook)
(buy 'backpack)

(printInfo)
