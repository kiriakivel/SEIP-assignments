# SEIP-assignments

[![Build Status](https://travis-ci.com/kiriakivel/SEIP-assignments.svg?token=hVEQWU791o2szb4sxgz7&branch=master)](https://travis-ci.com/kiriakivel/SEIP-assignments)

This repository contains the individual lab assignments of Kyriaki Velliniati for the course Software Engineering in Practice.

## Getting Started

If you want to run the code of the assignments, the following instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

Before you download and run the code, you need to have installed the following:

* Java - [download & instructions](https://java.com/en/download/help/download_options.xml)
* Maven - [download & instructions](https://maven.apache.org/install.html)
* Git - [download & instructions](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) 

### Installing

Follow the steps below to get the code running.

1. Clone or download the repository. You can do this by clicking the "Clone or download" button and choosing "Download ZIP", or by executing the following command at your target directory:

```
git clone https://github.com/kiriakivel/SEIP-assignments.git
```

2. When the files are unzipped, get inside the generated directory by:

```
cd SEIP-assignments
```

3. Then build the project by executing:

```
mvn package
```

The repository consists of a parent module and several sub-modules, one for each assignment. So this command downloads all necessary dependencies and builds the executable *jar files* you need, one for each module.

The jar files will be found in the "target" folder of each module.

You can then cd your terminal in the target folder you want and run the command:
```
java -jar (name-of-executable).jar
```
Then the application of the chosen assignment will be executed.

## Module Projects

* [gradeshistogram](https://github.com/kiriakivel/SEIP-assignments/blob/master/seip2020_practical_assignments/gradeshistogram/README.md) - Produces a histogram of grade frequency.
* [unittesting](https://github.com/kiriakivel/SEIP-assignments/blob/master/seip2020_practical_assignments/unittesting/README.md) - Mathematical functions and their unit tests.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Kyriaki Velliniati** - *Coding* - [profile](https://github.com/kiriakivel)
* **Antonios Gkortzis** - *Code Reviews* - [profile](https://github.com/AntonisGkortzis)



