(ns tutorial.exceptionHandling)

(defn ExHandling
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Do not apply inc on str."))))

(ExHandling "teste")

(defn ExHandling2
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Couth Exception:" (.getMessage e)))
    (catch Exception e (println "Couth Generic Exception:"))
    (finally (println "cleanup and move on"))))

(ExHandling2 "test")
