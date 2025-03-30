# Design Overview

While building this project, I tried to focus on both performance and SOLID principles.

## Algorithm

My **first approach** for the `Anagram Finder` algorithm was to sort each word, put the sorted word as a key in a **Map**, and add the word in a **List** of **String** paired to the sorted word. This approach worked as expected, but the problem is that sorting has a time complexity of `O(nlogn)`, which is not the best, even more so if we have very large strings instead of simple words.

In my **second approach**, I decided to use a `Histogram` instead of a sorted word as a key. By `Histogram` I mean an array of ints of size 128, where each index represents an character converted to ASCII code. In this way we can store all repetitions of chars from a string. So I created a `Histogram` class which takes a string in it's constructor and converts it into an array of int by iterating over the string, and keeping track of each `char` count. For this class to work with the HashMap, I used the `equals()` and `hashCode()` method. So now instead of sorting each string and placing it as a key if absent, we generate a `Histogram` and then place it as a key if absent, which reduces the time complexity of `O(nlogn)` from sorting, to `O(n)`.

Even though the second method is more efficient in terms of time complexity, if we want to only find anagrams for short words, the first approach might be better because a string will take much less space than an array of int!

## Reading input and writing output

For reading and writing I decided to separate the logic in 2 separate interfaces.

### InputReadable Interface
This interface has a method `getWords()` which has to be implemented.

The reading class `TextFileReader` implements `InputReadable`, it reads from a file using **streams**, this decision was made so the whole file isn't stored in memory at once, thus preventing memory overload for very large files.


### OutputWriteable Interface
This interface has a method `writeAnagrams()` which has to be implemented.

The first writing class `ConsoleWriter` just writes the words from a **Map** into the console.

The second writing class `TextFileWriter` writes in the output file using the **buffered writing** method, which allows for the data to be written incrementally in a file. I chose this method for better performance in case of very large numbers of words to be written in a file!

## Design Principles

For better **readability**, **maintainability** and  **scalability**, I tried to develop my solution with the SOLID principles in mind:

- All the classes inside my solution have a single clear responsibility.
- Created **small interfaces** for both reading the **input** and **writing** the output. This allows for other **input** and **output** sources, like a database or other type of file to be implemented.
- Created the `Processor` class to decouple the AnagramFinder class from the **input** and **output** mechanisms. This class allows the **input** and **output** to be flexible, enabling different types of input sources and output destinations to work with the `AnagramFinder` without requiring any changes to it. For example, in my solution I switched the object of type `TextFileWriter` with `ConsoleWriter` without any problems.

## File Structure

I organized the classes into different packages to enhance **modularity**, **maintainability**, and **readability**. The `com.internship.io` contains all the **classes** and **interfaces** related to **input** and **output** operations. `com.internship.logic` contains the algorithm implementation **class**, and `com.internship.utils` contains a **Data Class**.

