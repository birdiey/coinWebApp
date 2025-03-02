# Coin Toss Game - README

## Overview

This project is a simple web-based coin toss game implemented using Java Servlets and JSP. The game allows a user to guess the outcome of a coin toss (either "head" or "tail"). The server generates a random guess, compares it with the user's input, and determines the outcome of the game.

## Project Structure

The project is organized into three main packages:

1. **za.ac.tut.business**: Contains the core business logic for generating a random guess and determining the outcome of the coin toss.
2. **za.ac.tut.web**: Contains the servlet that handles the HTTP request, processes the user's input, and forwards the result to a JSP page for display.

### Key Classes

- **GuessGenerator**: Generates a random guess ("head" or "tail").
- **TossProcessor**: Compares the user's guess with the server's guess and determines the outcome.
- **TossServelet**: Handles the HTTP POST request, processes the user's input, and forwards the result to the JSP page.

## How It Works

1. **User Input**: The user selects either "head" or "tail" and submits the form.
2. **Server Guess**: The `GuessGenerator` class generates a random guess ("head" or "tail").
3. **Outcome Determination**: The `TossProcessor` class compares the user's guess with the server's guess and determines the outcome.
4. **Result Display**: The result is forwarded to the `outcome.jsp` page, which displays the user's guess, the server's guess, and the outcome.

## Setup and Running the Project

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Apache Tomcat,GlassFish or any other servlet container
- IDE (e.g., IntelliJ IDEA, Eclipse) with support for Java EE

### Steps to Run

1. **Clone the Repository**: Clone this repository to your local machine.
2. **Import the Project**: Import the project into your IDE as a Maven project.
3. **Configure Tomcat**: Set up Apache Tomcat in your IDE and configure it to deploy the project.
4. **Run the Project**: Deploy the project to Tomcat and start the server.
5. **Access the Application**: Open a web browser and navigate to `http://localhost:8080/your-project-name` (replace `your-project-name` with the actual name of your project).

 

This project demonstrates a simple web application using Java Servlets and JSP. It can be extended with additional features, such as keeping track of scores, adding more complex game logic, or improving the user interface.


