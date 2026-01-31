# Borsibaar Application – Test Plan

## 1. Testing Objectives
Verify that all core features work correctly, ensure system stability, security, and usability, and detect defects early.

## 2. Testing Levels
- Unit Testing – Individual classes and methods  
- Integration Testing – Backend modules, database, frontend-backend interaction  
- System Testing – Entire system tested together  
- Acceptance Testing – Mentor/product owner validation  

## 3. Test Scope
### In Scope
- Login/Register and role-based access  
- Inventory management  
- Transaction tracking  
- Drink price calculation  
- Public price page  
- API endpoints and database operations  
- UI functionality  

### Out of Scope
- Operating system issues  
- Network problems  
- Third-party services  

## 4. Test Approach
- Functional and regression testing  
- API testing using Postman  
- Manual UI testing  
- Security testing  
- Database testing  
- Basic performance testing  

## 5. Test Environment
- Backend: Spring Boot, Java 21  
- Frontend: Next.js  
- Database: PostgreSQL  
- Browser: Chrome, Firefox  
- API Tool: Postman  
- Version Control: GitHub  

## 6. Entry and Exit Criteria
**Entry:** Code pushed, build successful, test environment ready  
**Exit:** Critical bugs fixed, ≥90% test cases executed, mentor approval  

## 7. Roles and Responsibilities
- QA/Tester – Write and execute test cases, report bugs  
- Developer – Fix defects, write unit tests  
- Team Lead – Coordinate testing  
- Mentor – Final validation  

## 8. Risks and Assumptions
**Risks:** Changing requirements, integration issues, database errors, time limits  
**Assumptions:** Requirements are clear, team members available, stable test environment  

## 9. Test Deliverables
- Test Plan document  
- Test Cases  
- Bug Reports  
- Test Summary Report
