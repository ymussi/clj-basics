(ns tutorial.sequences)

(defn Seq []
  (def collors (seq ["red" "green" "blue"]))
  (println collors)

  ;cons append an element into a sequence.
  ;the first parameter is a element and a second is a sequence.
  (println (cons "yellow" collors))
  (println (cons collors "yellow"))

  ; conj append an element into a list.
  ; if a first parameter is list, conj append an element at the beginning.
  (println (conj collors "yellow"))
  
  ; now if a first parameter is a vector, conj append a element at the end.
  (println (conj ["red" "green" "blue"] "yellow"))

  ; concat allow us concatenate two sequences, basically put them together
  ; into a new sequence.
  (println (concat collors (seq ["black" "white"])))

  ; distinct - get only unique elements in the sequence, whatever the numbers.
  (println (distinct (seq [ 2 3 5 5 4 3 2 6 7 9 7 4 1 0 7 8 ])))
  
  ; reverse implies it reverses the order of the elements in sequence.
  (println (reverse collors))

  ; first - bring us the first element of the sequence.
  (println (first collors))

  ; rest - bring us the rest elements or after the first elements of the sequence.
  (println (rest collors))

  ; last - it's gonna give us the last element of the sequence.
  (println (last collors))

  ; sort - it's gonna give us sorting elements of the sequence.
  (println (sort (seq [ 2 4 6 7 3 9 0 1 5 8]))))

(Seq)

; this function distinct and organize a numbers of the sequence.
(defn organize
  [n]
  (sort (distinct n)))

(organize [ 2 5 3 6 7 4 9 0 1 5 4 5 7 6 3 8])
