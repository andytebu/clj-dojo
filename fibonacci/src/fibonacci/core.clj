(ns fibonacci.core
  (:gen-class))

(defn fibonacci [n]
  (if (or (= n 0) (= n 1))
    1
    (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

(defn -main
  [& args]
  (let [n (Integer/parseInt (first args))]
    (println (str (fibonacci n)))))
