# Assessment

## Exercise 1: Code Review

This will asses your knowledge of
[Code Smells](https://refactoring.guru/refactoring/smells), [clean code](#how)
and the ability to comment on or critique code. The code in
[CodeToReview.txt](Exercise1/CodeToReview.txt) has been submitted by another 
team to a code base you depend on. Using inline comments, review the code with
either questions for clarification or feedback with enough context for the
author to learn and enhance the code.

### Reflection

After completing your code review, add a brief comment at the end explaining:

- Which code smell you found most concerning and why
- What questions you would ask the original author for clarification

## Exercise 2: Working with legacy code

This will asses your [TDD](#what) skills and your ability to work safely with
existing code. Use tests to gain an understanding of the existing behaviours and
ensuring your changes are safe. Your task is to
[refactor](https://en.wikipedia.org/wiki/Code_refactoring) the code in the
respective tech stack `Exercise2` folder. Use comments, commit messages
and automated tests to express your reasoning, assumptions and issues
encountered. Ensure you explicitly list all tools used if not already listed in
the current project.

## Exercise 3: Clean green fields project

This will asses your

- Ability to design solutions
- Ability to decompose problems
- Knowledge of clean architecture
- Knowledge of continuous delivery and devops 
- Ability to identify constraints and assumptions
- Awareness of cognitive biases
- Test driven development skills

> **As** an enthusiastic card player and developer
>
> **I want to** create a program to play cards against the computer
>
> **So that** when I am bored I can play against an intelligent opponent.


### Constraints

Unsure of what UI to build for, or what card game I should code for. We will
figure that out later. At this stage I know I need a concept of a Deck, Cards
and the ability to Shuffle them.

How would you setup your new solution and why?

- Show me your initial to do list with some reasoning, for example:
  - Development environment setup
  - Scaffold / structure of your solution
  - What would your delivery pipeline look like
- Scaffold your solution
  - See how much you can scaffold out to hand to your future self or another 
    team member to continue with

### Architecture Decision Record

Document one significant design decision you made, including:

- Alternative approaches you considered and why you chose your approach
- What you learned or what surprised you during the implementation

## Appendix

Bellow you will find some resources to help you understand our engineering
culture. These are categorised into the the three main pillars of every change
we make.

1. The Why ( Values, Documentation, Commit messages, Comments )
2. The What ( Principles, Documentation, Tests )
3. The How ( Process, Architecture, Code, Tools )

### Why

- Documentation
  - [C4 Model](https://c4model.com/)
  - [Arc 42 templates](https://arc42.org/overview)
  - [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/)
  - [Documenting Architecture Decisions](https://cognitect.com/blog/2011/11/15/documenting-architecture-decisions)
  - [Mermaid Markdown](https://mermaid.js.org/#/)

### What

- [Test Driven Development (TDD)](https://en.wikipedia.org/wiki/Test-driven_development)
  - Test first: Red, Green, Refactor
  - Test naming: Given_When_Then
  - Structure: Arrange, Act, Assert
  - Process:
    - Start with degenerate test cases first.
    - As the tests get more specific, the code becomes more generic.
  - [Katas](http://codekata.com/):
    - [Uncle Bobs TDD Kata](https://www.youtube.com/watch?v=kScFczWbwRM)
    - [Gilding the Rose](https://youtu.be/kTcDBYCpj7Q)
  - Two TDD styles,
    [London vs Chicago](https://devlead.io/DevTips/LondonVsChicago) more
    concretely covered by Sandro Mancuso below
  - [Uncle bobs response to TDD Harms Architecture](http://blog.cleancoder.com/uncle-bob/2017/03/03/TDD-Harms-Architecture.html)
  - [Interesting debate](https://www.youtube.com/watch?v=KtHQGs3zFAM)
  - [Why TDD sometimes feels hard](https://www.youtube.com/watch?v=UWtEVKVPBQ0)
  - [TDD for those who don't need it](https://www.youtube.com/watch?v=a6oP24CSdUg)

### How

- [Agile manifesto](https://agilemanifesto.org/)
  - The values and principles are key to understanding no matter what agile
    methodology is used.
- Clean Architecture
  - [Architecture 101](https://hackernoon.com/how-to-design-a-web-application-software-architecture-101-eecy36o5)
  - [Jason Taylors - Clean Architecture repo](https://github.com/jasontaylordev/CleanArchitecture)
    and [here it is Explained](https://www.youtube.com/watch?v=YiVqwoFMieg)
  - [Here is Steve Smiths version](https://github.com/ardalis/CleanArchitecture)
    for a comparison
  - [Clean Architecture and Design by Robert C. Martin (Uncle Bob)](https://www.youtube.com/watch?v=2dKZ-dWaCiU)
  - [Linking TDD and Clean Architecture by Sandro Mancuso](https://www.youtube.com/watch?v=KyFVA4Spcgg).
    Does TDD Really Lead to Good Design?
- Clean Code
  - [Clean code video series](https://cleancoders.com/library/all)
  - [SOLID Principles](https://en.wikipedia.org/wiki/SOLID)
  - [CUPID](https://dannorth.net/2022/02/10/cupid-for-joyful-coding/)
  - [Object Callisthenics](https://williamdurand.fr/2013/06/03/object-calisthenics/)
  - [Code Smells](https://refactoring.guru/refactoring/smells)
    - [Refactoring](https://en.wikipedia.org/wiki/Code_refactoring)
    - [Refactoring Techniques](https://refactoring.guru/refactoring/techniques)
  - [The last programming language](https://www.youtube.com/watch?v=P2yr-3F6PQo)

## Must Watch Software Talks For Software Engineers

- Christin Gorman “Gordon Ramsay Doesn’t Use Cake Mixes” ➡️
  <https://vimeo.com/28885655>
- Bryan Liles “Test all the f\*^&ing time” ➡️ <https://youtu.be/iwUR0kOVNs8>
- Gojko Adzic “Make Impacts, not Software” ➡️ <https://youtu.be/GnK_n9Udhhs>
- Jeff Patton “User Story Mapping” ➡️ <https://youtu.be/AzBuohuOU6g>
- Michael Nygard "Uncoupling" ➡️ <https://youtu.be/mAw4ygX1c-4>
- Gregor Hohpe “Enterprise Architecture = Architecting the Enterprise?” ➡️
  <https://youtu.be/DdJNLeYldUs>
- Eric Evans "Tackling the complexity at the heart of software" ➡️
  <https://youtu.be/dnUFEg68ESM>
- Jim Webber, "The Present and Future of Native Graph Technology" ➡️
  <https://youtu.be/_CQehnb6A6o>
- Jez Humble, “CD sounds great, but can’t work here” ➡️
  <https://youtu.be/IvWr29afDF8>
- Anita Sengupta, “The future of Mars exploration" ➡️
  <https://youtu.be/iuzZYzns-Yg>
- Hanna Fry, “How to be human in the age of the machine” ➡️
  <https://youtu.be/Rzhpf1Ai7Z4>
