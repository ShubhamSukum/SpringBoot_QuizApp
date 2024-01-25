# Spring Boot Quiz App

## preview link

```bash
https://springboot-quiz-app-monolithic.onrender.com/question/allQuestions
```

## Overview

Welcome to the Spring Boot Quiz App! This application is designed to provide a seamless and user-friendly quiz-taking experience. Whether you are a developer looking to integrate a quiz feature into your project or a user interested in taking quizzes, this app has you covered.

## Features

- **Quiz Creation:** Easily create quizzes with a user-friendly interface. Add questions, options, and specify correct answers effortlessly.
- **Quiz Taking:** Users can take quizzes, view their scores, and receive instant feedback on their performance.
- **Scoring:** The app automatically calculates and displays scores upon completing a quiz, making it easy for users to track their progress.

## Getting Started

### Prerequisites

- Java JDK 8 or later
- Maven
- PosgresSQL database

### Installation

1. Clone the repository:

```bash
git clone https://github.com/your-username/spring-boot-quiz-app.git
```

## Application Setup Guide

Follow these steps to configure and run the application:

### Step 1: Configure Database
Edit the `application.properties` file to include your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Step 2: Build and Run Application
Execute the following commands in your terminal to build and run the application:

cd spring-boot-quiz-app
mvn spring-boot:run

Now, you can access the application at http://localhost:8080.

Please replace `your_database`, `your_username`, and `your_password` with your actual database name, username, and password respectively.