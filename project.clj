(defproject parens-of-the-dead "1.0.0"
  :description    "A series of zombie-themed games written in Clojure and ClojureScript."
  :url            "www.parens-of-the-dead.com"
  :jvm-opts       ["-XX:MaxMetaspaceSize=256m"]
  :source-paths   ["src/main/clojure"]
  :test-paths     ["test/main/clojure"]
  :resource-paths ["resources"]

  :plugins        [[lein-cljfmt "0.6.6"]
                   [lein-nsorg "0.3.0"]]

  :dependencies   [[org.clojure/clojure "1.10.1"]]

  :aliases        {"lint-fix" ["do"
                               ["nsorg" "--replace"]
                               ["cljfmt" "fix"]]}
  :profiles       {:dev {:plugins      []
                         :dependencies []
                         :repl-options {:init-ns advent-of-code}
                         :init (println "Advent of Code 2019")}})
