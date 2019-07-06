(ns tutorial.dataTypes2
  (:gen-class))

"set"

;- set of different types of values
;- immutable
;- efficient
;- #{}
;- #{1 42 1.5 "PET" 'CAT}

"map"

;- similar to dict
;- {:key1 value1, :key2 value2}
;- immutable
;- efficient
;- #{:key1 "value1"}
;- #{1 42 1.5 "PET" 'CAT}

"vector"

;- similar to list / arrays
;- arrays
;- immutable
;- efficient
;- indexed by position
;- [ 1 2 3 4]
;- [1 "two" "three"]
;- []

"list"

;- similar to tuples
;- make up the coode
;- immutable
;- efficient
;- (1 2 3 4)
;- (1 "two" 'three (1 2 3 4))
;- (defn foo [] (println "hello"))
;  (foo)

