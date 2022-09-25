# CPIT 305 Advanced Programming

This repository contains all code done during lectures.


## Topics
1. [Review](#review)
1. [IO Stream](#io-stream)
1. [Exception Handling](#exception-handling)
1. [Threads](#threads)

## Review
- Inhretance [Lecture 01](/src/lecture01), [Lecture 02](/src/lecture02/review)
- Access modifier [Lecture 02](/src/lecture02/review/Demo.java)
- Pass by Value [Lecture 02](/src/lecture02/review/PassByValue.java)
- Pass by Reference [Lecture 02](/src/lecture02/review/PassByRefrence.java) 
- Method Overloading [Lecture 02](/src/lecture02/review/Demo2.java) 

## IO Stream
Here the class diagram for all IO Stream
![IO Stream Class diagram](/images/iostream.jpg)

- User Input using `System.in` and `Scanner`
  - String Parser using `StringTokenizer` [Lecture 03](/src/lecture04/text/DataEntry.java)
- Text File
  - Write text file using
    - `FileOutputStream` [Lecture 02](/src/lecture02/file_info/Demo.java)
    - `BufferedOutputStream` [Lecture 02](/src/lecture02/file_info/UsingBuffer.java)
    - `PrintWriter` and read user input using `System.in` and `Scanner` [Lecture 04](/src/lecture04/text/Demo.java)
  - Read text file using `FileInputStream` and array of byte
    - Read part of a text file (*no loop*) [Lecture 03](/src/lecture03/InputDemo.java)
    - Read whole text file (**general reader**) [Lecture 03](/src/lecture03/FileReaderDemo.java)
  - Read text file using `BufferedReader` and `InputStreamReader` [Lecture 04](src/lecture04/text/ReadText.java)
- Binary File with fixed string an example of data recored (int, char[15], double)
  - Write binary file
    - using `DataOutputStream` [Lecture04](/src/lecture04/binaryexm/WriteBinary.java)
  - Read binary file using `DataInputStream`
    - read single recored from file by moving file currsor into specifc position in the file [Lecture 04](/src/lecture04/binaryexm/ReadBinaryByPos.java)
    - read whole file recored by recored until reaching end of file using `EOFException` [Lecture 04](/src/lecture04/binaryexm/ReadBinary.java)
- Using input `mark` and `reset` from `BufferedInputStream` [Lecture 05](/src/lecture05/usingmark/Demo.java)
- Read/Write binary file using `RandomAccessFile` [Lecture 05](/src/lecture05/bytestream/Demo.java)
- Binary file simulate database management system that include (add/edit/delete/search) using `RandomAccessFile` [Lecture 06](/src/lecture06/bytestream)
- `File` usage:
  - Reterive file information and check its existance [Lecture 07](/src/lecture07/filemanager/Demo.java)
  - Create new file and delete it [Lecture 07](/src/lecture07/filemanager/FileCreator.java)
  - Create new Directory and delete it using [Lecture 07](/src/lecture07/filemanager/FolderCreator.java)
  - Using `JFileChooser` and list selected directory files [Lecture 07](/src/lecture07/filemanager/FileBrowser.java)
  - List all files and directories and sub-directories recursively as a tree [Lecture 07](/src/lecture07/filemanager/FileTree.java)
- Working with class instance to be stored/read in/from a file using `ObjectOutputStrea` and `ObjectInputStream` [Lecture 09](/src/lecture09/serial)
  - First you make sure your class is serializable (`implements Serializable`)
    - example Student class [Lecture 09](/src/lecture09/serial/Student.java)
  - Write Object onto file [Lecture 09](/src/lecture09/serial/WriteObject.java)
  - Read Several stored objects from a binary file [Lecture 09](/src/lecture09/serial/ReadObject.java)

## Exception Handling
- Throw an exception to stop recursion backword [Lecture 08](/src/lecture08/throwexample/Demo.java)
- Unexpected result when using return within a finally block [Lecture 08](/src/lecture08/finallyexample/Demo.java)
- Custom Exception [Lecture 08](/src/lecture08/custom_exception)
- Custom uncheck exception (RuntimeException) [Lecture 10 NegativeAmountException](/src/lecture10/bankexample/NegativeAmountException.java )
- Custom uncheck exception (RuntimeException) [Lecture 10 SameAccountException](/src/lecture10/bankexample/SameAccountException.java)
  - using above custom exceptions [Lecture 10 Bank](/src/lecture10/bankexample/Bank.java#L16-L17), [Lecture 10 ATM](/src/lecture10/bankexample/ATM.java#L16-L18)

## Threads

![Thread States](/images/thread-vs-process-states.svg)

- Example of calculating the sum of an array using:
  - signle thread - *main* thread [Lecture 09](/src/lecture09/multithread/Mono.java)
  - multithreads [Lecture 09](/src/lecture09/multithread/Multi.java)
- Example of shared resource between threads:
  - Counter: Two threads increasing static variable shared between them. Each thread increases the `counter` 1000000 times, so the final value of `counter` after both threads should be 2000000
    - incorrect way to increase a counter using several threads [Lecture 09](/src/lecture09/multicounter)
    - solve for previous example
      - adding synchronized to method signture [Lecture 10](/src/lecture10/solved/solution1/multicounter)
      - using synchronized block [Lecture 10](/src/lecture10/solved/solution2/multicounter)
  - Bank and ATM: A bank has several customers' accounts. ATMs use an instance of that bank and call `transfer` method in order to transfere from account to another. Each ATM works as a thread. The transfer occors in the same time which may cause unexpected result. That is, bank instance initilized with number of accounts with initial amount of 1000.0 SAR. Assume that number of accounts is 10. The total balance of the bank should always 1000.0 * 10 = 10000.0; however, do to the concurrent transfer the total bank balance change which it should not.
    - Unsolved example: [Lecture 10](/src/lecture10/bankexample)
    - Solved example:
      - using synchronized keyword with `transfer` method signture [Lecture 10](/src/lecture10/solved/solution1/bankexample)
      - using synchronized block [Lecture 10](/src/lecture10/solved/solution2/bankexample)



## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
