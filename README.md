# Property Manager

This repository contains code for managing property portfolios using a Java-based application. The project provides functionalities to add, edit, and remove properties, as well as view a summary of the portfolio through a graphical user interface (GUI).

## Features

- Add new properties with detailed information.
- Edit existing property details.
- Remove properties from the portfolio.
- View a summary of all properties, including key statistics.
- Intuitive GUI for easy interaction.

## Prerequisites

- Java Development Kit (JDK) installed on your system.
- An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse (optional but recommended).

## Installation

1. **Clone this repository:**

   ```bash
   git clone https://github.com/GurvirSingh04/Property-Manager.git
   cd Property-Manager
   ```

2. **Compile the application:**

   If you're using an IDE, open the project and build it. If you prefer the command line:

   ```bash
   javac *.java
   ```

3. **Run the application:**

   ```bash
   java PropertyViewerGUI
   ```

## File Structure

- `Property.java` - Defines the Property class with its attributes and methods.
- `PropertyManager.java` - Handles the logic for adding, editing, and removing properties.
- `PropertyViewerGUI.java` - Contains the GUI implementation for interacting with the property portfolio.
- `README.md` - Documentation for the project.

## How It Works

- The application initializes by loading existing properties (if any) into the portfolio.
- Users can add new properties by providing details such as address, price, and description.
- Existing properties can be edited or removed through the GUI.
- The portfolio summary provides an overview of all properties, displaying key information and statistics.

---

*Note: This README is based on the available information from the repository as of February 9, 2025.* 
