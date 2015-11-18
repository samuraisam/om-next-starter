(defproject om-starter "0.1.0-SNAPSHOT"
  :description "My first Om program!"
  :plugins [[lein-cljsbuild "1.1.1"]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.145"]
                 [org.omcljs/om "1.0.0-alpha14"]
                 [figwheel-sidecar "0.4.0" :scope "provided"]
                 [bidi "1.20.3"]
                 [ring/ring "1.4.0"]
                 [com.cognitect/transit-clj "0.8.281"]
                 [com.cognitect/transit-cljs "0.8.225"]
                 [cljs-http "0.1.30" :exclusions
                  [org.clojure/clojure org.clojure/clojurescript
                   com.cognitect/transit-cljs]]]
  :source-paths ["src"]
  :cljsbuild {
    :builds [
      {:id "min"
       :source-paths ["src"]
       :compiler {:output-to "main.js"
                  :optimizations :advanced
                  :pretty-print false}}]})
