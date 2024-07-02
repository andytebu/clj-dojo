(ns hello-world.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [hello-world.core :refer []]))

(deftest a-test
  (testing "1 is 1"
    (is (= 1 1))))
