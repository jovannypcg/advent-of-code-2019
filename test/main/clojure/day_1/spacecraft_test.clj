(ns day-1.spacecraft-test
  (:require [day-1.spacecraft :as spacecraft]
            [clojure.test :refer :all]))

(deftest module-fuel-required
  (testing ""
    (is (= 2
           (spacecraft/module-fuel-required 12)))))

