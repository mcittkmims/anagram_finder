# Instructions

### Clone Git Reposetory

Clone the repository in the location you want from the terminal with:
```bash
git clone https://github.com/mcittkmims/anagram_finder.git
```

Access the cloned project from terminal with:
```zsh
cd anagram_finder
```

### Prerequisites

Ensure that you have Java 17 and Maven installed on your machine.

- You can verify if Java is installed by running `java -version` in the terminal.

- You can verify if Maven is installed by running `mvn -v` in the terminal.

If Java 17 or Maven is not installed, please install them before proceeding.

### Build the Project
Before running the project, build it with the following command:

```bash
mvn clean install
```

This will compile the project and package it for execution.

### Run the project

Run the project from terminal with:
```bash
mvn exec:java
```

### Check Results
The results will appear in the terminal, or from the source root of the project, you can check the results at `src/main/resources/output.txt` 


## Additional Notes

* To change the input, you can do so at `src/main/resources/sample.txt`

* To run the project, go to the source root, open the terminal, and repeat the steps from `Run the project`.

