(ns day-2.intcode
  (:require [common.misc :as misc]
            [clojure.edn :as edn]))

(defonce gravity-assist-codes
  (-> "day_2/codes.edn"
      misc/load-resource
      edn/read))

;; Codes
;; 99 halts the program
;; 1  Adds the numbers in the following 2 positions and stores in the 3 position
;; 2  Multiplies the numbers in the following 2 positions and stores in the 3 position

;; Before running the program, replace position 1 with 12 and position 2 with 2
(def alarm-1202-codes
  (assoc gravity-assist-codes
         1 12
         2 2))

(defn apply-operation
  [f
   codes
   first-operand
   second-operand
   result-pos]
  (let [result (f first-operand second-operand)]
    (assoc codes result-pos result)))

(defn apply-opcode
  [opcode
   codes
   first-operand
   second-operand
   result-position]
  (case opcode
    1  (apply-operation + codes first-operand second-operand result-position)
    2  (apply-operation * codes first-operand second-operand result-position)
    99 codes
    (throw (ex-info (str "Unknown opcode " opcode)))))

(defn alarm-1202
  [alarm-codes]
  (loop [codes              alarm-codes
         opcode-pos         0]
    (let [opcode         (nth codes opcode-pos)
          first-operand  (nth codes (get codes (+ 1 opcode-pos)))
          second-operand (nth codes (get codes (+ 2 opcode-pos)))
          result-pos     (get codes (+ 3 opcode-pos))
          sum            (+ first-operand second-operand)
          mul            (* first-operand second-operand)
          updated-codes  (apply-opcode opcode codes first-operand second-operand result-pos)]
      (if (= 99 opcode)
        (first updated-codes)
        (recur updated-codes (+ 4 opcode-pos))))))

(alarm-1202 alarm-1202-codes)

