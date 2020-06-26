(ns common.misc
  (:require [clojure.java.io :as io]))

(defn load-resource
  "Loads a file from the 'resource/' directory
  given the incomine filename."
  [filename]
  (-> filename
      io/resource
      slurp
      .getBytes
      io/reader
      java.io.PushbackReader.))
