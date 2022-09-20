# CPIT 305 Advanced Programming

This repository contains all code done during lectures.


## Lectures Topics

### Review
- Inhretance [Lecture 01](/src/lecture01), [Lecture 02](/src/lecture02/review)
- Access modifier [Lecture 02](/src/lecture02/review/Demo.java)
- Pass by Value [Lecture 02](/src/lecture02/review/PassByValue.java)
- Pass by Reference [Lecture 02](/src/lecture02/review/PassByRefrence.java) 
- Method Overloading [Lecture 02](/src/lecture02/review/Demo2.java) 

### File Stream
- User Input using `System.in` and `Scanner`
  - String Parser using `StringTokenizer` [Lecture 03](/src/lecture04/text/DataEntry.java)
- Write text file
  - using `FileOutputStream` [Lecture 02](/src/lecture02/file_info/Demo.java)
  - using `BufferedOutputStream` [Lecture 02](/src/lecture02/file_info/UsingBuffer.java)
  - using `PrintWriter` and read user input using `System.in` and `Scanner` [Lecture 04](/src/lecture04/text/Demo.java)
- Read text file using `FileInputStream` and array of byte
  - Read part of a text file *no loop* [Lecture 03](/src/lecture03/InputDemo.java)
  - Read whole text file **general reader** [Lecture 03](/src/lecture03/FileReaderDemo.java)
- Read text file using `BufferedReader` and `InputStreamReader` [Lecture 04](src/lecture04/text/ReadText.java)

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
