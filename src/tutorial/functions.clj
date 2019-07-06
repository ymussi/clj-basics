(ns tutorial.functions
  (:gen-class))

; to create a simple function
(defn -main
  "First function"
  []
  (println "My name is Yuri")
  (+ 2 3))

; to create a anonymous function with one parameter
(#(println "hello" %) "Yuri Mussi")

; to create a anonymous function with more parameters
(#(println "hello" %1 "how are you" %2) "Yuri" "Today")

; to define a name to the function
(def increment (fn [x] (+ x 1)))

(defn increment-set
  []
  (map increment [1 2 3]))

(defn increment-set-2
  [x]
  (map increment x))

;
;(defn soma
;  [n1 n2]
;  (def res (+ n1 n2))
;
;  (println res))
;
;(soma 10 20)



