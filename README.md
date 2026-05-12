# Tetris in JavaFX

A modern remake of the classic Tetris built with Java and JavaFX.

> ⏸️ **Status:** This project is currently on hiatus. The codebase is stable and playable, but active development is paused. Planned features are still on the roadmap for when work resumes.

## About

This project is a from-scratch implementation of Tetris using JavaFX for rendering and game logic. It started as a school project and is being expanded into a longer-term personal project, with additional features and polish planned over time.

## Features

- Classic Tetris gameplay with all seven standard tetrominoes
- Smooth piece movement, rotation, and line clearing
- Score tracking and increasing difficulty
- Built entirely with JavaFX — no external game engines

## Tech Stack

- **Language:** Java
- **UI Framework:** JavaFX
- **Build Tool:** Maven (with Maven Wrapper)

## Getting Started

### Prerequisites

- **JDK 17** or higher
- **Maven** (optional — the included Maven Wrapper works without a global install)

### Installation

Clone the repository:

```bash
git clone https://github.com/ZBramblett/Tetris-in-JavaFX.git
cd Tetris-in-JavaFX
```

### Running the Game

Using the Maven Wrapper:

```bash
# macOS / Linux
./mvnw javafx:run

# Windows
mvnw.cmd javafx:run
```

Or with a global Maven install:

```bash
mvn javafx:run
```

## Controls

| Key            | Action              |
| -------------- | ------------------- |
| ← / →          | Move piece left/right |
| ↓              | Soft drop           |
| ↑              | Rotate piece        |
| Space          | Hard drop           |
| P              | Pause / resume      |

*(Update this table if your actual key bindings differ.)*

## Roadmap

- [ ] Hold-piece functionality
- [ ] Next-piece preview
- [ ] High score persistence
- [ ] Sound effects and music

## Project Structure

```
Tetris-in-JavaFX/
├── src/main/         # Application source code
├── pom.xml           # Maven configuration
├── mvnw, mvnw.cmd    # Maven Wrapper scripts
└── README.md
```

## License

This project is open source. Feel free to fork it and experiment.

## Acknowledgments

Originally started as a school project, now being continued and expanded as a personal portfolio project.
