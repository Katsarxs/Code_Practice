# Tabloid 2 Python
S2S (Source-To-Source) compiler which turns fun programming language [**Tabloid**](https://tabloid.vercel.app) into Python code using [ANTLR](https://www.antlr.org/) (ANother Tool for Language Recognition).

## Installing ANTLR
Find all the information on how to download and install ANTLR in your OS [here](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#installation).

## Usage
Download `Tabloid.g4` and `Tabloid2Python.java` files from the folder. Run the commands :
```bash
java org.antlr.v4.Tool Tabloid.g4
javac Tabloid*.java Tabloid2Python.java
```
After that, run any code of Tabloid language using this format :
```bash
java Tabloid2Python yourfile.tbd
```
This should generate a Python file named `yourfile.py` and it should run successfully:
```bash
python yourfile.py
```

## Comment
I was asked to make the compiler to read extra things (comments, while statement) that Tabloid language doesn't support. Plus, the comments in my code are Greeklish (Greek language with English alphabet). I'll translate it soon in English.
