(defproject sample-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [metosin/compojure-api "1.1.12"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler controllers.handler/app}
  :uberjar-name "server.jar")