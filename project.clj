(defproject pulsar-spike "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [hikari-cp "1.6.1"]
                 [org.postgresql/postgresql "9.4.1208.jre7"]
                 [co.paralleluniverse/quasar-core "0.7.4"]
                 [co.paralleluniverse/pulsar "0.7.4"]]
  :java-agents  [[co.paralleluniverse/quasar-core "0.7.4"]])
