(defproject panthera "0.1-SNAPSHOT"
  :description "Data Frames in Clojure (with Pandas)"
  :url "https://github.com/alanmarazzi/panthera"
  :scm {:name "git" :url "https://github.com/alanmarazzi/panthera"}
  :license {:name "EPL-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[cnuernber/libpython-clj "0.11"]
                 [org.clojure/core.memoize "0.7.2"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]]}})
