# Advent of Code 2019

Solutions to problems from Advent of Code 2019.

- [Prerequisites](#prerequisites)
  * [SDKMan](#sdkman)
  * [Installing Java 8 Using SDKMan](#installing-java-8-using-sdkman)
  * [Installing Clojure](#installing-clojure)
- [Usage](#usage)
  * [Start a REPL](#start-a-repl)
  * [Playing around](#playing-around)
- [Testing](#testing)

## Prerequisites

* Java 8
* Clojure 1.10.1
* Leiningen 2.9.3 (optional)

### SDKMan

Java 8 can be installed via [SDKMan](https://sdkman.io/install), which is a version manager for technologies related to the Java Virtual Machine (similar to `rbenv` for Ruby or `pyenv` for Python).

### Installing Java 8 Using SDKMan

```shell
$ sdk install java 8.0.242.hs-adpt
$ export JAVA_HOME=~/.sdkman/candidates/java/current
```

### Installing Clojure

Visit the [official web site](https://clojure.org/guides/getting_started) to get the instructions according to your operating system.

### Installing Leiningen

Visit the [official web site](https://leiningen.org/#install) to get the instructions according to your operating system.

## Usage

### Leiningen

#### Start a REPL

```shell
$ cd /path/to/repo
$ lein repl
```

#### Playing around

Once the repl has started, change the namespace for the one you are interested in.
For example, to play around with the `day-1.spacecraft` namespace, run:

```shell
advent-of-code=> (in-ns 'day-1.spacecraft)
#object[clojure.lang.Namespace 0x7725cd39 "day-1.spacecraft"]

day-1.spacecraft=> (fuel-required module-masses)
4959709
```

#### Testing

```shell
$ lein test
```

### Clojure CLI

#### Start a REPL

```shell
$ cd /path/to/repo
$ clj
Clojure 1.10.1
user=>
```

#### Playing around

Once the repl has started, load the `advent_of_code.clj` file, that requires the namespaces
of all days. It is like a facade to those namespaces to avoid loading each file. Then change the current
namespace for the one you are interested in.

For example, to play around with the `day-1.spacecraft` namespace, run:

```shell
user=> (load-file "src/main/clojure/advent_of_code.clj")
nil

user=> (in-ns 'day-1.spacecraft)
#object[clojure.lang.Namespace 0x7725cd39 "day-1.spacecraft"]

day-1.spacecraft=> (fuel-required module-masses)
4959709
```


#### Testing

```shell
$ clj -Atest
```
