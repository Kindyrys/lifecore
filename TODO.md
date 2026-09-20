# LifeCore — TODO

## Current stage

Stage 1 — Project organization and Spring Boot setup

---

## Project setup

- [x] Create GitHub repository
- [x] Create Spring Boot project
- [x] Connect project with GitHub
- [x] Configure PostgreSQL database
- [x] Run Spring Boot application successfully
- [x] Add README.md
- [x] Add PROJECT_CONTEXT.md
- [x] Create TODO.md
- [x] Create LEARNING_LOG.md

---

## Next tasks

- [x] Add base package structure
- [x] Create first simple HomeController
- [x] Create first Thymeleaf page
- [x] Verify application opens in browser
- [x] Commit base MVC structure
- [x] Improve index.html with Bootstrap layout
- [x] Create TransactionType ENUM
- [x] Create Transaction entity
- [x] Create Category entity
- [x] Create TransactionRepository
- [x] Create FinanceService
- [x] Add getAllTransactions method
- [x] Create FinanceController
- [x] Add transactions page endpoint
- [x] Create transactions HTML template
- [x] Pass transactions to template using Model
- [x] Display empty transactions message
- [x] Add transactions table template
- [x] Add transaction form UI
- [x] Add saveTransaction method
- [x] Add POST endpoint for creating transaction
- [x] Connect transaction form to POST endpoint
- [x] Add CSRF token to transaction form
- [x] Save transaction from form to PostgreSQL
- [x] Add basic frontend validation to transaction form
- [x] Add backend validation annotations to Transaction
- [x] Add @Valid and BindingResult to transaction POST endpoint
- [x] Bind transaction form with th:object
- [x] Replace form name attributes with th:field
- [x] Display field-level validation errors in transaction form
- [x] Add custom validation messages to Transaction
- [x] Sort transactions by date descending
- [x] Add stable sorting by date and id
- [x] Add deleteTransactionById method
- [x] Add delete transaction endpoint
- [x] Add delete button to transactions table
- [x] Delete transaction from PostgreSQL
- [x] Add delete confirmation
- [x] Improve transaction table layout
---

## Base package structure

Create packages inside:

```text
src/main/java/com/kindyrys/lifecore