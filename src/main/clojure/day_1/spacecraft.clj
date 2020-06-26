(ns day-1.spacecraft
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(defonce module-masses
  (-> "module-masses.edn"
      io/resource
      slurp
      .getBytes
      io/reader
      java.io.PushbackReader.
      edn/read))

(defn module-fuel-required
  [module-mass]
  (-> module-mass
      (/ 3.0)
      Math/floor
      (- 2)
      int))

(defn fuel-required
  [module-masses]
  (->> module-masses
       (map module-fuel-required)
       (reduce +)))
