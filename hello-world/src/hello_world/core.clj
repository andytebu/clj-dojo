(ns hello-world.core
  (:gen-class))

(def ^:public
  a-greeting
  "Hello, World!")

(defn greeting
  "Returns a greeting."
  []
  a-greeting)

(defn -main
  "Main function that prints a greeting to the console."
  []
  (println greeting))