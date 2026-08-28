# Movie Ticket Booking Management Application

A full-stack movie ticket booking application built for the SkillWallet user stories.

## Technology
- Backend: Java 17 + Spring Boot 3
- Database: MySQL
- Frontend: HTML, CSS, JavaScript
- Build: Maven

## User Stories Covered
1. Submit Movie Ticket Request
2. Check Show Availability
3. Calculate Booking Cost
4. Confirm Booking Request
5. Maintain Movie and Show Data
6. Review Booking Details
7. Process Ticket Booking
8. Notify Booking Confirmation

## Setup
1. Install Java 17+, Maven and MySQL.
2. Create database:
   `CREATE DATABASE movie_booking;`
3. Update `backend/src/main/resources/application.properties` if your MySQL username/password differs.
4. Run backend:
   `cd backend && mvn spring-boot:run`
5. Open `frontend/index.html` in a browser.

Default MySQL settings in the project are user `root` and password `root`.
