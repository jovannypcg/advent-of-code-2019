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

### SDKMan

Java 8 can be installed via [SDKMan](https://sdkman.io/install), which is a version manager for technologies related to the Java Virtual Machine (similar to `rbenv` for Ruby or `pyenv` for Python).

### Installing Java 8 Using SDKMan

```shell
$ sdk install java 8.0.242.hs-adpt
$ export JAVA_HOME=~/.sdkman/candidates/java/current
```

### Installing Clojure

Visit the [official web site](https://clojure.org/guides/getting_started) to get the instructions according to your operating system.

## Usage

### Start a REPL

```shell
$ cd /path/to/repo
$ clj
```

### Playing around

Once the repl has started, load the files you are interested in executing and change to the appropriate namespace.
For example, to load the `spacecraft.clj` file in the `day_1` directory to play with its functions, run:

```shell
user=> (load-file "src/main/clojure/day_1/spacecraft.clj")
#'day-1.spacecraft/fuel-required

user=> (in-ns 'day-1.spacecraft)

day-1.spacecraft=> (fuel-required module-masses)
4959709
```

## Testing

```shell
$ clj -Atest
```
