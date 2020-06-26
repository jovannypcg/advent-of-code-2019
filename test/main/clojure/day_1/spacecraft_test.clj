(ns day-1.spacecraft-test
  (:require [clojure.test :refer :all]
            [day-1.spacecraft :as spacecraft]))

(def module-masses
  [67931
   140303
   100800
   69347
   113036
   127599
   55139
   99718
   110237
   94677])

(deftest single-fuel-required
  (testing "Fuel calculation required for single module"
    (are [mass result]
         (is (= result (spacecraft/single-fuel-required mass)))
    ; mass result
      12     2
      14     2
      1969   654
      100756 33583)))

(deftest module-fuel-required
  (testing "Fuel calculation required for single module"
    (are [mass result]
         (is (= result (spacecraft/module-fuel-required mass)))
    ; mass   result
      12     2
      14     2
      1969   966
      100756 50346)))

(deftest fuel-required
  (testing "Fuel required for a set of modules"
    (is (= 489075 (spacecraft/fuel-required module-masses)))))
