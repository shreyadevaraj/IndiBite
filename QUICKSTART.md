# 🚀 Quick Start Guide - Running IndiBite

## ✅ Current Status
- ✅ Backend and Frontend are fully integrated
- ✅ Project structure is complete
- ✅ All files are in place
- ✅ Java 17 is installed

## 🎯 How to Run (Choose ONE method)

### Method 1: Using VS Code (RECOMMENDED)

1. **Install Required Extensions** (if not already installed):
   - Open VS Code
   - Go to Extensions (Ctrl+Shift+X)
   - Search and install:
     - "Extension Pack for Java" by Microsoft
     - "Spring Boot Extension Pack" by VMware

2. **Open the Project**:
   - File → Open Folder
   - Select: `D:\IndiBite\IndiBite`

3. **Wait for Maven to Download Dependencies**:
   - Look at the bottom right corner
   - Wait for "Importing projects..." to complete
   - This may take 2-5 minutes on first run

4. **Run the Application**:
   - Open: `src/main/java/com/indibite/IndiBiteApplication.java`
   - You'll see a "Run" button above the `main` method
   - Click "Run" or press F5
   
   OR
   
   - Press Ctrl+Shift+P
   - Type: "Spring Boot Dashboard"
   - Click on "IndiBite" → Click the play button ▶️

5. **Access the Application**:
   - Wait for console message: "Started IndiBiteApplication"
   - Open browser: http://localhost:8080

---

### Method 2: Using IntelliJ IDEA

1. **Open Project**:
   - File → Open
   - Select: `D:\IndiBite\IndiBite`
   - Click "Trust Project"

2. **Wait for Indexing**:
   - Wait for Maven to sync (bottom right corner)
   - This downloads all dependencies

3. **Run**:
   - Navigate to: `src/main/java/com/indibite/IndiBiteApplication.java`
   - Right-click on the file
   - Select: "Run 'IndiBiteApplication.main()'"
   
   OR
   
   - Click the green play button ▶️ next to the class name

4. **Access**: http://localhost:8080

---

### Method 3: Using Eclipse

1. **Import Project**:
   - File → Import → Maven → Existing Maven Projects
   - Root Directory: `D:\IndiBite\IndiBite`
   - Click Finish

2. **Wait for Maven Build**:
   - Check bottom right for progress
   - Wait for "Building workspace" to complete

3. **Run**:
   - Right-click on project
   - Run As → Spring Boot App

4. **Access**: http://localhost:8080

---

### Method 4: Install Maven and Run from Command Line

1. **Download Maven**:
   - Visit: https://maven.apache.org/download.cgi
   - Download: apache-maven-3.9.x-bin.zip
   - Extract to: `C:\apache-maven`

2. **Add to PATH**:
   - Search Windows: "Environment Variables"
   - Edit "Path" variable
   - Add: `C:\apache-maven\bin`
   - Click OK

3. **Restart Terminal and Run**:
   ```bash
   cd D:\IndiBite\IndiBite
   mvn spring-boot:run
   ```

4. **Access**: http://localhost:8080

---

## 🎉 What to Expect

When the application starts successfully, you'll see:

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.0)

...
Started IndiBiteApplication in 3.456 seconds (JVM running for 4.123)
```

Then open: **http://localhost:8080**

---

## 🌐 Application Pages

Once running, you can access:

- **Home**: http://localhost:8080/ or http://localhost:8080/index.html
- **Menu**: http://localhost:8080/menu.html
- **Build Thali**: http://localhost:8080/thali.html
- **Order/Cart**: http://localhost:8080/order.html
- **H2 Database Console**: http://localhost:8080/h2-console

---

## 🐛 Troubleshooting

### "Port 8080 already in use"
- Stop any other application using port 8080
- OR edit `src/main/resources/application.properties`:
  ```properties
  server.port=8081
  ```

### "Cannot resolve dependencies"
- Check internet connection
- Delete `%USERPROFILE%\.m2\repository` folder
- Restart IDE and let Maven re-download

### "Class not found"
- Clean and rebuild:
  - VS Code: Ctrl+Shift+P → "Java: Clean Java Language Server Workspace"
  - IntelliJ: Build → Rebuild Project
  - Eclipse: Project → Clean

---

## 📞 Need Help?

If you're still having issues:
1. Make sure Java 17 is installed: `java -version`
2. Make sure you're in the correct directory: `D:\IndiBite\IndiBite`
3. Check if `pom.xml` exists in the current directory
4. Try running from your IDE (easiest method)

---

**The project is ready to run! Just choose your preferred method above.** 🚀
