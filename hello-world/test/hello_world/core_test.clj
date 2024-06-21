(ns hello-world.core-test
  (:require [clojure.test :as test :refer [deftest is testing]]
            [hello-world.core :as core :refer [a-greeting greeting]]))

(deftest greeting-test
  (testing
   "greeting returns a greeting"
    (is (= a-greeting (greeting)))))