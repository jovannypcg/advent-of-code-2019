(ns day-1.spacecraft
  (:require [clojure.edn :as edn]
            [common.misc :as misc]))

(defonce module-masses
  (-> "module-masses.edn"
      misc/load-resource
      edn/read))

(defn single-fuel-required
  [module-mass]
  (-> module-mass
      (/ 3.0)
      Math/floor
      (- 2)
      int))

(defn module-fuel-required
  [mass]
  (loop [fuel       (single-fuel-required mass)
         total-fuel 0]
    (if (<= fuel 0)
      total-fuel
      (recur (single-fuel-required fuel)
             (+ fuel total-fuel)))))

(defn fuel-required
  [module-masses]
  (->> module-masses
       (map module-fuel-required)
       (reduce +)))
