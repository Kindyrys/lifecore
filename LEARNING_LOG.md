## 2026-07-09
- Created repisitory on GitHub with SSH protection
- Open repository on IntelijIdea using option by external link.
- Created SpringBoot project and added some dependencies as a Spring Protections
- Marked pom.xml as a maven project
- Configured application.properties file with the connection to DB URL login and password
- In the same file configured Hibernate which is responsible for creating tables based on the java classes
- In PGAdmin app created new db

## 2026-07-12

### What I learned

- What Java packages are.
- Why backend projects need package structure.
- Why Git does not track empty folders.
- What package-info.java is used for.

### What I practiced

- Created base packages for the LifeCore project.
- Added package-info.java files.
- Added correct package declarations.

### What is unclear

- Need more practice with Java package structure.

### What I need to repeat

- package declaration syntax.
- Git workflow: status, add, commit, push.

### Next step

- Create first simple HomeController.
## 2026-07-17

### What I learned

- What a Spring MVC Controller is.
- How @Controller works.
- How @GetMapping("/") maps a browser request.
- How return "index" connects Controller with Thymeleaf template.
- Where Spring Boot searches HTML templates.

### What I practiced

- Created HomeController.
- Created index.html.
- Opened the application in the browser.

### What is unclear

- Need more practice with Controller and View flow.

### What I need to repeat

- @Controller
- @GetMapping
- return view name
- templates folder

### Next step

- Commit base MVC structure.
## 2026-07-18

### What I learned

- What Bootstrap is.
- How Bootstrap CSS is connected through CDN.
- How Bootstrap classes change HTML appearance.
- What container, mt-5, text-center, card, card-body, card-title and card-text do.

### What I practiced

- Improved index.html with Bootstrap.
- Created simple module cards for Finance, Tasks and Habits.
- Tested spacing classes like mt-3 and mt-5.

### What is unclear

- Need more practice reading Bootstrap documentation.

### What I need to repeat

- Bootstrap class syntax.
- Difference between regular HTML and Bootstrap-styled HTML.

### Next step

- Start Finance module with Transaction entity.
## 2026-07-18

### What I learned

- What JPA Entity is.
- How @Entity maps a Java class to database.
- What @Id means.
- How @GeneratedValue works.
- Why BigDecimal is used for money.
- Why LocalDate is used for dates.
- How enum is stored with @Enumerated(EnumType.STRING).

### What I practiced

- Created Transaction entity.
- Added id field.
- Added amount, description, transactionDate and type fields.
- Used TransactionType enum inside Entity.

### What is unclear

- Need more practice with JPA annotations.

### What I need to repeat

- @Entity
- @Id
- @GeneratedValue
- @Enumerated(EnumType.STRING)
- BigDecimal
- LocalDate

### Next step

- Add constructors, getters and setters to Transaction entity.