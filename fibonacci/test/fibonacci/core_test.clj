(ns fibonacci.core-test
  (:require [clojure.test :as test :refer [deftest is testing]]
            [fibonacci.core :as core :refer [fibonacci]]))

(deftest fibonacci-test
  (testing "Fibonacci of 0 should be 1"
    (is (= 1 (fibonacci 0))))

  (testing "Fibonacci of 1 should be 1"
    (is (= 1 (fibonacci 1))))

  (testing "Fibonacci of 2 should be 2"
    (is (= 2 (fibonacci 2))))

  (testing "Fibonacci of 3 should be 3"
    (is (= 3 (fibonacci 3))))

  (testing "Fibonacci of 4 should be 5"
    (is (= 5 (fibonacci 4))))

  (testing "Fibonacci of 5 should be 8"
    (is (= 8 (fibonacci 5))))

  (testing "Fibonacci of 6 should be 13"
    (is (= 13 (fibonacci 6)))))


(def test-cases
  {{:n 0} {:expected 1}
   {:n 1} {:expected 1}
   {:n 2} {:expected 2}
   {:n 3} {:expected 3}
   {:n 4} {:expected 5}
   {:n 5} {:expected 8}
   {:n 6} {:expected 13}
   {:n 7} {:expected 21}})

(deftest fibonacci-test-2
  (doseq [[{:keys [n]} {:keys [expected]}] test-cases]
    (testing (str "Fibonacci of " n " should be " expected)
      (is (= expected (fibonacci n))))))



  