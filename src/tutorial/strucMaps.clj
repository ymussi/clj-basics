(ns tutorial.strucMaps)

(defn Pets []
  ; create a structure map
  (defstruct pet :PetType :PetName)
  (def myPet (struct pet "dog" "pingo"))
  (println myPet)

  
  (def myOtherPet (struct-map pet :PetName "fifi" :PetType "cat"))
  (println myOtherPet)
  (println (:PetName myPet))
  (println (:PetType myOtherPet))

  ; to associate a structure map.
  (def myNewPat (assoc myPet :PetName "Max"))
  (println myNewPat)

  ; to associate a new key to structure map.
  (def myNewOtherPet (assoc myOtherPet :PetAge 10))
  (println myNewOtherPet))

(Pets)
