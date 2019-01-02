(defproject claire "0.1.0-SNAPSHOT"
  :description "a clojure app"
  :url "https://github.com/jiangplus/claire"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.8.0"] [clj-http "3.9.1"]]
  :main ^:skip-aot claire.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
