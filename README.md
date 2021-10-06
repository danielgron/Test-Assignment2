# Test-Assignment2

# 1 REFLECTIONS

## 1.1 COMPUTER MOUSE

*Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.*

- **Test individual component samples (capacitors, resistors etc.)**

- **Plug in mouse to different systems (hardware / software) to identify driver errors and similar issues.**

- **Test extended use (vast amount of mouse clicks, and movement)**

## 1.2 CATASTROPHIC FAILURE

*Find a story where a software system defect had a bad outcome.*

**Boing suffered from issues with the software managing sensor input, likely causing 2 crashes of the plane type 737 MAX.**



https://www.fierceelectronics.com/electronics/killer-software-4-lessons-from-deadly-737-max-crashes
https://www.washingtonpost.com/world/asia_pacific/boeing-issues-warning-on-potential-instrument-malfunction-after-indonesia-crash/2018/11/07/b43168b6-e265-11e8-a1c9-6afe99dddd92_story.html

<br><br><br><br>

# 2 TWO KATAS

*Complete the following using TDD. Remember the TDD mantra.*

## 2.1 STRING UTILITY

*Use TDD to create a string utility with the following methods:_

- Reverse string (aBc -> cBa)
- Capitalize string (aBc -> ABC)
- Lowercase string (aBc -> abc)

*Don’t use any built-in string utility – create your own. Remember, the exercise here is to use TDD, not to deliver a
working utility without tests. If there are no tests in the solution, it won’t be accepted.*

## 2.2 BOWLING GAME KATA

*Complete the Bowling Game Kata using TDD. The slides can be found here:
http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt*

<br><br><br><br>

# 3 INVESTIGATION OF TOOLS

## 3.1 JUNIT 5

*Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.*

- @Tag

**Enables filtering ie "Integrationtest", "UnitTest"**

- @Disabled

**Disables test - Useful if not needed at the current time**

- @RepeatedTest

**Runs test a set amount of times**

- @BeforeEach, @AfterEach

**Setup/teardown test ressources ie new () of the class being tested**

- @BeforeAll, @AfterAll

**Setup teardown at test class level**

- @DisplayName

**Display a custom displayname**
- @Nested

**Enables ordering tests in nested classes, giving a better structure in some cases**

- assumeFalse, assumeTrue

**Make assumptions that decide if test should be run, ie tests that should only run on a specific environmnent**

## 3.2 MOCKING FRAMEWORKS

*Investigate mocking frameworks for your preferred language. Choose at least two frameworks, and answer the questions. (
One could be Mockito, which we saw in class.)*

- What are their similarities?
- What are their differences?
- Which one would you prefer, if any, and why?


Mockito vs PowerMock:

They are similar in that they are both able to mock dependencies (surprise!)

Mockito is a pretty straight forward mocking framework that can easily mock dependencies in well structured code designed with unit testing in mind.

Powermock is slightly more complicated, but will 