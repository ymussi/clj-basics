(ns tutorial.loops
  (:gen-class))

(defn Loop []
  (println "\nLoop:")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x)))))

(Loop)

(defn DoTimes []
  (println "\nDoTimes:")
  (dotimes [x 10]
    (println x)))

(DoTimes)

(defn WhileDo
  [count]
  (println "\nWhileDo:")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc))))

(WhileDo 10)

(defn DoSeq
  [seq]
  (println "\nSoSeq:")
  (doseq [x seq]
    (println (inc x))))

(DoSeq [5 7 8 9 4 6 3 2 6])
