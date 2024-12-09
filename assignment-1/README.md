# Project Title

A brief description of your project and its purpose.

---

## Programming Language: Go

This project was developed using **Go**, a statically typed, compiled language designed for simplicity, efficiency, and scalability. Go was chosen for the following reasons:

- **Performance**: Go's lightweight goroutines make it ideal for handling concurrent operations efficiently.
- **Simplicity**: Its clean syntax and built-in support for common functionalities such as HTTP servers and JSON parsing accelerate development.
- **Scalability**: Go is optimized for building scalable applications with high throughput.

---

## Steps to Install Go Using SDK Manager

Follow these steps to install and manage Go using **SDKMAN!**:

1. Open your terminal and run the following command to install SDKMAN!:
   ```bash
   curl -s "https://get.sdkman.io" | bash

2.Restart your terminal or initialize SDKMAN! by running:
   ```bash
   source "$HOME/.sdkman/bin/sdkman-init.sh"
   ```
3.Verify the installation by running:
   ```bash
   sdk version
   ```
4.List all available Go versions
   ```bash
   sdk list go
   ```
5.Install your desired version of Go (e.g., 1.20.5)
   ```bash
   sdk install go 1.20.5
   ```
6.Verify the Go installation:
   ```bash
   go version
   ```
8.Set a specific version of Go as default:
   ```bash
   sdk default go 1.20.5
   ```
9.clone and go to the folder
   ```bash
   git clone https://github.com/saliou-tech/ednova-assignments.git
   cd assignment-1
   ```
10.Run the application:
   ```bash
   go run main.go
   ```

### Challenge face and solution implemented
The main challenge was installing SDKMAN! on my machine. To overcome this, I used a Docker container, installed the appropriate image, and then set up SDKMAN! inside the container.





